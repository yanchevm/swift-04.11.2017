package com.company;

import java.time.Year;
import java.util.Scanner;

public class Task7_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First name:");
        String firstName = sc.next();
        System.out.println("Last name:");
        String lastName = sc.next();
        System.out.println("Year of birth:");
        int birthYear = sc.nextInt();
        System.out.println("Kg:");
        double kg = sc.nextDouble();
        System.out.println("Height:");
        double height = sc.nextDouble();
        System.out.println("Profession:");
        String profession = sc.next();

        int old = Year.now().getValue() - birthYear;

        System.out.println(firstName+" "+ lastName+" is " +old +" years old. His weight is " +kg+" and he is "+
                height + " cm tall. He is a student.");

    }
}
