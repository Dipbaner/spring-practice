package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // Manually Creating Object
//        Alien obj = new Alien();
//        obj.code();

        // Getting bean from Spring

        Alien obj1 = (Alien)context.getBean(Alien.class);
        obj1.code();
	}

}
