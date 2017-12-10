package com.swift.lectures;

import java.util.Calendar;
import java.util.Scanner;

public class Task7_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        short birthDate = scan.nextShort();
        double weight = scan.nextDouble();
        short height = scan.nextShort();
        String occupation = scan.nextLine();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = (year - birthDate);

        System.out.println(firstName + " " + lastName + " is " + age + " years old. " +
                "His weight is " + weight + " and he is " + height + " cm tall. " + "He is a" + occupation + ".");
    }
}
