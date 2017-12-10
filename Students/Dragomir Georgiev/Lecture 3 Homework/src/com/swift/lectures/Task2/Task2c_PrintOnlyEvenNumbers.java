package com.swift.lectures.Task2;

import java.util.Scanner;

// NOT COMPLETED
public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < number; i++) {
            int newNumber = sc.nextInt();
            if (newNumber % 2 == 0) {
                System.out.println(newNumber);
            }
        }

    }
}
