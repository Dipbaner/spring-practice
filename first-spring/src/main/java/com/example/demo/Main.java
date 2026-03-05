package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationBeanContext.xml");

        GreetingService greetingService = (GreetingService) applicationContext.getBean("myBean");

        greetingService.sayHello();

        Student student = (Student) applicationContext.getBean("student");

        student.helloStudent();
    }
}
