package com.swift.academy.homework.Task_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int myNumber = validateNumber();
        System.out.println("Result: " + ++myNumber);
    }

    // Милен: Какво прави този метод ?
    // Валидира число или чете, валидира и връща число ?
    // Аз бих го кръстил - readNumberFromConsole
    public static int validateNumber() {      // Validation to make sure a valid number is entered
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

        // Милен: Добра практика е след използването на скенера, да го затваряш
    }
}
