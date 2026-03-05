package com.ecommerce.service;

public class Order {

    private static int counter = 1;
    private int orderId;

    public Order(){
        orderId = counter++;
        System.out.println("new Order Created : "+orderId);
    }

    public int getOrderId(){
        return orderId;
    }
}
