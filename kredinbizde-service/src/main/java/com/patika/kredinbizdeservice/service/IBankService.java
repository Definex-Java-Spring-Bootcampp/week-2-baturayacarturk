package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Bank;
import java.util.List;

public interface IBankService {

    Bank createBank(Bank bank);
    Bank getBankByName(String bankName);
    List<Bank> getBanksWithCreditCardsAndCampaigns();


}
