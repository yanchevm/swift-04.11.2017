package com.swift.academy.homework.Task_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size for the array: ");
        int count = readNumberFromConsole();
        while (count < 1) {
            System.out.print("Please enter a positive number: ");
            count = readNumberFromConsole();
        }

        System.out.print("Enter numbers separated by whitespace: ");
        String input = sc.nextLine().trim();

        String[] numbersAsString = input.split(" ");
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            try {
//Милен: Все още не сме взели за колекции
                arr[i] = Integer.parseInt(numbersAsString[i]);                      //аз тук бих използвал лист пред масив, защото ако не успеем да парснем някоя стойност

            } catch (NumberFormatException e) {                                     //ще останем с нулева стойност в масива, но в условието пише масив.
                System.out.printf("%s is not an integer", numbersAsString[i]);
                System.out.println();
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            }
            else {
                System.out.printf(", %d", arr[i]);
            }
        }
    }

    public static int readNumberFromConsole() {
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
