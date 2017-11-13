package com.swift.academy.homework.Task_0;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = Task0a_ReadInt.validateNumber();
        if (age >= 18) {
            System.out.println("Go drink!");
        }
        else {
            System.out.println("Go drink, don't get caught.");
        }
    }
}
