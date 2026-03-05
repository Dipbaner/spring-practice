package org.example;

import com.example.service.Student;
import com.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("beansConfig.xml");

        StudentService s1 = (StudentService) context.getBean("studentService");
        s1.enrollStudent("Dip Banerjee");

        System.out.println();
        System.out.println();

        Student student = (Student) context.getBean("student");
        student.setName("Harshit Kushwah");
        s1.enrollStudent(student.getName());

        System.out.println();
        System.out.println();

        Student student1 = (Student) context.getBean("student");
        student1.setName("Prashant");
        s1.enrollStudent(student1.getName());




    }
}