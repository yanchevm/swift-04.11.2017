package com.swift.academy.homework.Task_2;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = Task0a_ReadInt.validateNumber();
        while (count < 1) {
            System.out.print("Enter a positive number: ");
            count = Task0a_ReadInt.validateNumber();
        }

        System.out.println("Enter separated numbers: ");
        String input = sc.nextLine().trim();
        String[] numbers = input.split(" ");
        System.out.print("Even numbers in sequence: ");
        for (String number:numbers) {
            try {
                int parsedNum = Integer.parseInt(number);
                if (parsedNum % 2 == 0) {
                    System.out.print(parsedNum + " ");
                    System.out.println();
                }
            } catch (NumberFormatException e) {}
        }
    }
}
