package com.swift.academy.homework;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int count = Task0a_ReadInt.validateNumber();

        System.out.printf("Enter %d numbers.", count);
        System.out.println();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Next number: ");
            numbers[i] = Task0a_ReadInt.validateNumber();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
