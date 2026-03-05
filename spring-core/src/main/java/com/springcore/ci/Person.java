package com.springcore.ci;

import com.springcore.ci.Certificate;

public class Person {

    private String name;
    private int personId;
    private Certificate certifiacte;

    public Person(String name, int personId, Certificate certifiacte) {
        this.name = name;
        this.personId = personId;
        this.certifiacte = certifiacte;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId + " certifiacte=" + certifiacte.toString() +
                '}';
    }
}
