package com.training.retailorderhub.service;

import org.springframework.stereotype.Component;

import com.training.retailorderhub.repository.PaymentStrategy;


@Component("APPLE_PAY")
public class ApplePayStrategy implements PaymentStrategy {

    @Override
    public boolean charge(double amount) {
        System.out.println("Charging  ApplePay card: " + amount);
        return true;
    }
}
