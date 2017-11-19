package com.swift.academy.homework.Task_0;

public class Task0_Classes {

    public static void main(String[] args) {

        // person class test
        Person ivan = new Person();
        ivan.greet();
        System.out.println("=====================");

        Person penka = new Person("Penka Ivanova");
        penka.greet();
        System.out.println("=====================");

        Person iliya = new Person("Iliya Yanev", 24);
        iliya.greet();
        System.out.println("=====================");

        Person person = new Person("12341Absa", - 24);
        person.greet();
        System.out.println("=====================");

        Person pesho = new Person("Pesho", -1);
        pesho.greet();
        System.out.println("=====================");

        // car class test
        Car mercedess = new Car("Mercedess-Benz", "S220", 160, 2010);
        System.out.println(mercedess.insuranceCategory());
        System.out.println(mercedess.tax());
        System.out.println("=====================");

        Car opel = new Car("Opel", "Astra", 85, 1996);
        System.out.println(opel.insuranceCategory());
        System.out.println(opel.tax());
    }
}
