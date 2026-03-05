package com.example;

public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Code compiled by Desktop");
    }
}
