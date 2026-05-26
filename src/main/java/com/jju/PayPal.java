package com.jju;

public class PayPal implements PaymentMethod {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Redirecting $" + amount + " to PayPal account: " + email);
    }
}
