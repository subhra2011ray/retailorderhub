package com.training.retailorderhub.repository;

public interface PaymentStrategy {
    public boolean charge(double amount);
    
}
