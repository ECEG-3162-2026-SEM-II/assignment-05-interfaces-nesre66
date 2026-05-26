package com.jju;

public class CreditCard implements PaymentMethod {

    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Charging $" + amount + " to Card: " + cardNumber);
    }
}