package org.example;

import com.springcore.ci.Addition;
import com.springcore.ci.Person;
import com.springcore.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Student s1 = (Student) context.getBean("student");
        System.out.println(s1.toString());

        Employee emp1 = (Employee) context.getBean("employee");
        System.out.println(emp1.getName());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getCourses());

        Person person1 = (Person) context.getBean("person");
        System.out.println(person1.toString());

        Addition addition1 = (Addition) context.getBean("addition");
        addition1.doSum();
    }
}