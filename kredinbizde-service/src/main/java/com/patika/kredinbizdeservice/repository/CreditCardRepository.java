package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CreditCardRepository implements ICreditCardRepository{
    private List<CreditCard> creditCards  = new ArrayList<>();
    @Override
    public CreditCard createCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
        return creditCard;
    }

    @Override
    public List<CreditCard> findCreditCarsByBank(Bank bank) {
        return creditCards.stream()
                .filter(creditCard -> creditCard.getBank().equals(bank))
                .collect(Collectors.toList());
    }
}
