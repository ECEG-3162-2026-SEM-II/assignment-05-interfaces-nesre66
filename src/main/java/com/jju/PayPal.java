package com.jju;

public class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        // TODO: Print "Redirecting $[amount] to PayPal account: [email]"
    }
}