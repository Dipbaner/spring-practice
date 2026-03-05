package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void code(){
        laptop.compile();
    }
}
