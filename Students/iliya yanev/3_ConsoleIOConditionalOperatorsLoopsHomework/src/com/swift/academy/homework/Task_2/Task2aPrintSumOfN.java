package com.swift.academy.homework.Task_2;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

import java.util.Scanner;

public class Task2aPrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = Task0a_ReadInt.validateNumber();
        while (count < 1) {
            System.out.print("Enter a positive number: ");
            count = Task0a_ReadInt.validateNumber();
        }

        int sum = 0;
        System.out.println("Enter separated numbers: ");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");

        for (int i = 0; i < count; i++) {
            try {
                sum += Integer.parseInt(numbers[i]);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not an integer", numbers[i]);
                System.out.println();
            }
        }
        System.out.println("Sum: " + sum);
    }
}
