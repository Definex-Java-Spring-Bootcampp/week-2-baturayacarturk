package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.service.IBankService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/banks")
public class BankController {
    private IBankService bankService;

    public BankController(IBankService bankService) {
        this.bankService = bankService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bank create(@RequestBody Bank bank) {
        return bankService.createBank(bank);
    }
    @GetMapping()
    public Bank getBankByName(@RequestParam String name) {
        return bankService.getBankByName(name);
    }

    @GetMapping("/get-banks-with-credit-cards-and-campaigns")
    public List<Bank> getBanksWithCreditCardsAndCampaigns() {
        return bankService.getBanksWithCreditCardsAndCampaigns();
    }
}
