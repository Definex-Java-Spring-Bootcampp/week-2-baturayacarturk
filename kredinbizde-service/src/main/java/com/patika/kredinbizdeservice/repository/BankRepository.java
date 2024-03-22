package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Bank;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankRepository implements IBankRepository{
    private List<Bank> bankList = new ArrayList<>();

    @Override
    public Bank createBank(Bank bank) {
        bankList.add(bank);
        return bank;
    }

    @Override
    public Bank getBankByName(String bankName) {
        return bankList.stream()
                .filter(bank -> bank.getName().equals(bankName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Bank> getAll() {
        return bankList;
    }

}
