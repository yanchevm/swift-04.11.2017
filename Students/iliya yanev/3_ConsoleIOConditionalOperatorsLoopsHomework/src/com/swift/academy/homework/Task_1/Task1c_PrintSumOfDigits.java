package com.swift.academy.homework.Task_1;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

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
