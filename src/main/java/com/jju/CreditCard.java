package com.jju;

public class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // TODO: Print "Charging $[amount] to Card: [cardNumber]"
    }
}