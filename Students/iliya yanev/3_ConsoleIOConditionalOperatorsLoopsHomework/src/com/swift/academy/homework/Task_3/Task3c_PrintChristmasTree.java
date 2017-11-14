package com.swift.academy.homework.Task_3;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        System.out.print("Enter a size for the square: ");
        int size = Task0a_ReadInt.validateNumber();
        while (size < 5) {
            System.out.print("Enter a number larger than 5: ");
            size = Task0a_ReadInt.validateNumber();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < size * 2 - 1; i++) {
            if (i == size) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < size * 2 - 1; i++) {
            if (i < size - 1 || i > size + 1) {
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
    }
}
