package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.repository.IBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class BankService implements IBankService{

    private final IBankRepository bankRepository;
    private final ICreditCardService creditCardService;
    @Autowired
    public BankService(IBankRepository bankRepository, ICreditCardService creditCardService) {
        this.bankRepository = bankRepository;
        this.creditCardService = creditCardService;
    }

    @Override
    public Bank createBank(Bank bank) {
        bankRepository.createBank(bank);
        return bank;
    }

    @Override
    public Bank getBankByName(String bankName) {
        return bankRepository.getBankByName(bankName);
    }

    @Override
    public List<Bank> getBanksWithCreditCardsAndCampaigns() {
        List<Bank> banks=bankRepository.getAll();

        return banks;
    }

}
