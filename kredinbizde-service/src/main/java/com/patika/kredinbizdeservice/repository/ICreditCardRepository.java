package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;

import java.util.List;

public interface ICreditCardRepository {
    CreditCard createCreditCard(CreditCard creditCard);



    List<CreditCard> findCreditCarsByBank(Bank bank);
}
