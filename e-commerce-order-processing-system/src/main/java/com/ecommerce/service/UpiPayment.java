package com.ecommerce.service;

public class UpiPayment implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid "+amount+" using UPI ");
    }
}
