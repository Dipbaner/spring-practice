package com.example;

public class Alien {

    private int age;
    private Computer computer;
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    // Constructor For age
//    public Alien(int age) {
//        this.age = age;
//    }
//
//    public Alien(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void setAge(int age) {
        System.out.println("In SetAge");
        this.age = age;
    }

//    Alien() {
//        System.out.println("Alien Object Created");
//    }

//    public void code(){
//        System.out.println("I am coding");
//        laptop.compile();
//        pen.write();
//    }

    public void code(){
        System.out.println("I am Coding");
        computer.compile();
    }
}
