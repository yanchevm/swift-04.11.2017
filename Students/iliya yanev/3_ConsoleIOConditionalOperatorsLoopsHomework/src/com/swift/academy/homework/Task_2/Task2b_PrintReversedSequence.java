package com.swift.academy.homework.Task_2;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
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
        String[] reversedNumbers = new String[count];
        for (int i = 0; i < count; i++) {
            try {
                reversedNumbers[i] = numbers[count - 1 - i];
                    Integer.parseInt(reversedNumbers[i]);
                System.out.print(reversedNumbers[i] + " ");
            } catch (NumberFormatException e){ }
        }
    }
}
