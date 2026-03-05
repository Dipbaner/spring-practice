package com.ecommerce.service;

public class CreditCardPayment implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid "+amount+" using Credit Card" );
    }
}
