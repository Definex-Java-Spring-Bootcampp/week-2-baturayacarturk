package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.ICreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("prototype")
public class CreditCardService implements ICreditCardService {
    private ICreditCardRepository creditCardRepository;
    @Autowired
    public CreditCardService(ICreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public CreditCard createCreditCard(CreditCard creditCard) {
        creditCardRepository.createCreditCard(creditCard);
        return creditCard;
    }


}
