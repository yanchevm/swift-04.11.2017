package com.swift.academy.console;

import java.time.Year;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        // Creating scanner with name kb as for keyBoard
        Scanner kb = new Scanner(System.in);

        String name;
        String lastName;
        String profession;
        int year = Year.now().getValue();
        int age;
        double weight;
        int height;

        // Accepting Inputs from user
        System.out.println("Enter First Name");
        name = kb.nextLine();
        System.out.println("Enter Last Name");
        lastName = kb.nextLine();

        System.out.println("Enter the year of birth");
        age = year - kb.nextInt();
        System.out.println("Enter Weight In Kilograms");
        weight = kb.nextDouble();
        System.out.println("Enter Height in Centimetres");
        height = kb.nextInt();

        System.out.println("Enter Profession");
        profession = kb.next();

        // Outputting All
        System.out.println("Name : " + name
                + " " + lastName
                + " " + "is "
                + age
                + " "
                + "years old. His weight is"
                + " "
                + weight
                + "kg"
                + " "
                + "and he is"
                + " "
                + height
                + "cm tall. He is a "
                + profession);
    }
}
