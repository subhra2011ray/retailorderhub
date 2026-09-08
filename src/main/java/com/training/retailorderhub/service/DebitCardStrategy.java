package com.training.retailorderhub.service;

import org.springframework.stereotype.Component;

import com.training.retailorderhub.repository.PaymentStrategy;


@Component("DEBIT_CARD")
public class DebitCardStrategy implements PaymentStrategy {

    @Override
    public boolean charge(double amount) {
        System.out.println("Charging  Debit C card: " + amount);
        return true;
    }
}
