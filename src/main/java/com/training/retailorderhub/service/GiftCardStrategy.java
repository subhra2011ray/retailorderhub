package com.training.retailorderhub.service;

import org.springframework.stereotype.Component;

import com.training.retailorderhub.repository.PaymentStrategy;

@Component("GIFT_CARD")
public class GiftCardStrategy implements PaymentStrategy {

     @Override
    public boolean charge(double amount) {
        System.out.println("Charging  Gift card: " + amount);
        return true;
    }
}
