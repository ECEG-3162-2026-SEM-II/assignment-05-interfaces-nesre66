package com.jju;

public interface PaymentMethod {
    // The contract: any class implementing this MUST have a processPayment method
    void processPayment(double amount);
}