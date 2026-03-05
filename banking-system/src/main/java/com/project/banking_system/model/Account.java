package com.project.banking_system.model;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private int id;
    private String account_holder;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account_holder='" + account_holder + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
