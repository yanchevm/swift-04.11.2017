package com.swift.academy.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int myNumber = validateNumber();
        System.out.println("Result: "+ ++myNumber);
    }

    protected static int validateNumber() {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int number = 0;

        while (exit == false) {
            try {
                number = sc.nextInt();
                exit = true;
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid number: ");
                sc.nextLine();
            }
        }
        return number;
    }
}
