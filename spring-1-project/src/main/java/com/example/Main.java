package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContextBean.xml");

//        Alien obj = (Alien) context.getBean("alien");
//        obj.age = 20;
//        System.out.println(obj.age);
//        obj.code();
//
//        Alien obj1 = (Alien) context.getBean("alien");
//
//        System.out.println(obj1.age);
//        obj1.code();


        Alien obj = (Alien) context.getBean("alien");
        obj.code();
        System.out.println(obj.getAge());
    }
}
