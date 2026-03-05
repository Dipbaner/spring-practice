package com.example.service;

public class EmailNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Sent : "+message);
    }
}
