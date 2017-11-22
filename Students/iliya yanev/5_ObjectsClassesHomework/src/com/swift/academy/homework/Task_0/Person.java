package com.swift.academy.homework.Task_0;

public class Person {

    private String name;
    private int age;

    public Person() {
        this.name = "No name";
        this.age = -1;
    }

    public Person(String name) {
        setName(name);
        this.age = -1;
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void greet() {
        if (name.equals("No name")) {
            System.out.println("I am John Doe.");
        }
        else if (age < 0) {
            System.out.printf("Hello, I am %s.", name);
            System.out.println();
        }
        else {
            System.out.printf("Hello, I am %s. I am %d years old.", name, age);
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("^[A-Za-z]+((\\s)?((\\'|\\-|\\.)?([A-Za-z])+))*$")) {                // matches a correct name format
            this.name = name;
        }
        else {
            System.out.println("Name should start with capital letter and contain letters only.");
            this.name = "No name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Age cannot be negative.");
            this.age = -1;
        }
    }
}
