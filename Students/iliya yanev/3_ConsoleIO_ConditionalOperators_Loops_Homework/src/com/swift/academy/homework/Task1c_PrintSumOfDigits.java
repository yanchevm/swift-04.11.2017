package com.swift.academy.homework;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int inputNumber = Task0a_ReadInt.validateNumber();

        char[] numberAsCharArray = Integer.toString(inputNumber).toCharArray();
        int sum = 0;
        for (int number:numberAsCharArray) {
            sum += number - '0';
        }
        System.out.println("Sum of digits: " + sum);
    }
}
