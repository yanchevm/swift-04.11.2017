package com.swift.academy.homework.Task_5;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

import java.time.Year;
import java.util.*;

public class Task5_ProgramCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Count: ");
        int count = Task0a_ReadInt.validateNumber();
        while (count < 1) {                                  // Check for negative number or zero
            System.out.print("Enter a positive number: ");
            count = Task0a_ReadInt.validateNumber();
        }
        String output = "";
        String firstName = "";
        String lastName = "";
        int dob = 0;
        double weight = 0.0;
        int height = 0;
        String profession = "";

        for (int i = 0; i < count; i++) {
            while (firstName.equals("")) {
                System.out.print("Please enter a valid first name: ");
                firstName = sc.nextLine().trim();
            }

            while (lastName.equals("")) {
                System.out.print("Please enter a valid last name: ");
                lastName = sc.nextLine().trim();
            }

            while (dob < 1900) {
                System.out.print("Please enter a valid year of birth: ");
                dob = Task0a_ReadInt.validateNumber();
            }

            while (weight <= 0.0) {
                System.out.print("Please enter a valid weight: ");
                weight = validateDouble();
            }

            while (height <= 0) {
                System.out.print("Please enter a valid height: ");
                height = Task0a_ReadInt.validateNumber();
            }

            while (profession.equals("")) {
                System.out.print("Please enter a valid profession: ");
                profession = sc.nextLine().trim();
            }

            int age = Year.now().getValue() - dob;

            output += String.format("%s %s is %d years old. He was born in %d. His weight is %.6f and he is %d cm tall. He is a %s.", firstName, lastName ,age, dob, weight, height, profession);
            if (age < 18) {
                output += String.format(" %s %s is under-aged.\n", firstName, lastName);
            }
            else {
                output += "\n";
            }
            // reset variables
            firstName = "";
            lastName = "";
            dob = 0;
            weight = 0.0;
            height = 0;
            profession = "";
        }
        System.out.println(output);
    }

    private static double validateDouble() {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        double number = 0.0;

        while (exit == false) {
            try {
                number = sc.nextDouble();
                exit = true;
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid number: ");
                sc.nextLine();
            }
        }
        return number;
    }
}
