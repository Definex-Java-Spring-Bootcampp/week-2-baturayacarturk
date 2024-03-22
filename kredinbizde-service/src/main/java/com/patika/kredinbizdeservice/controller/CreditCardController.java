package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.service.ICreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/credit-cards")
public class CreditCardController {

    private ICreditCardService creditCardService;
    @Autowired
    public CreditCardController(ICreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreditCard create(@RequestBody CreditCard creditCard) {
        return creditCardService.createCreditCard(creditCard);
    }
}
