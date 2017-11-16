package com.swift.academy.homework.Task_0;

import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int count = Task0a_ReadInt.validateNumber();
        while (count < 1) {                                  // Check for negative number or zero
            System.out.print("Enter a positive number: ");
            count = Task0a_ReadInt.validateNumber();
        }

        System.out.println("Enter separated numbers: ");
        String input = sc.nextLine().trim();
        String[] numbers = input.split(" ");

        for (int i = 0; i < count; i++) {
            try {
                Integer.parseInt(numbers[i]);
                System.out.println(numbers[i]);
            } catch (NumberFormatException e) {
                System.out.println("Not an integer");
            }
        }
    }
}
