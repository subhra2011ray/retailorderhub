package com.training.retailorderhub.service;

import org.springframework.stereotype.Component;

import com.training.retailorderhub.repository.PaymentStrategy;

@Component("PAYPAL")
public class PayPalStrategy implements PaymentStrategy {

     @Override
    public boolean charge(double amount) {
        System.out.println("Charging PayPal: " + amount);
        return true;
    }
}
