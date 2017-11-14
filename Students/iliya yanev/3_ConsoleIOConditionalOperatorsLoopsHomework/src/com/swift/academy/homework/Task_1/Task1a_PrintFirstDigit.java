package com.swift.academy.homework.Task_1;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        System.out.print("Number: ");
        int number = Task0a_ReadInt.validateNumber();
        System.out.println(Integer.toString(number).charAt(0));
    }
}
