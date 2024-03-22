package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Bank;

import java.util.List;

public interface IBankRepository {

    Bank createBank(Bank bank);
    Bank getBankByName(String bankName);


    List<Bank> getAll();
}
