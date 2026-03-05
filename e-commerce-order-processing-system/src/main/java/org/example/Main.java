package org.example;

import com.ecommerce.service.Order;
import com.ecommerce.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("beanConfiguration.xml");

        OrderService orderService = (OrderService) context.getBean("orderService");

        Order order1 = (Order)context.getBean("order");
        Order order2 = (Order)context.getBean("order");

        orderService.placeOrder(order1, 5000);

        System.out.println();
        System.out.println();
        orderService.placeOrder(order2, 2000);
    }
}