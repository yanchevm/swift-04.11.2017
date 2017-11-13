package com.swift.academy.homework;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        System.out.print("Number: ");
        int number = Task0a_ReadInt.validateNumber();
        System.out.println(Integer.toString(number).charAt(0));
    }
}
