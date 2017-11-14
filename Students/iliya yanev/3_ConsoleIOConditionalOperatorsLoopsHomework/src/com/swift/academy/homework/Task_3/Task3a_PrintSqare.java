package com.swift.academy.homework.Task_3;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

public class Task3a_PrintSqare {
    public static void main(String[] args) {
        System.out.print("Enter a size for the square: ");
        int size = Task0a_ReadInt.validateNumber();
        while (size < 1) {
            System.out.print("Enter a positive number: ");
            size = Task0a_ReadInt.validateNumber();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print("* ");
                }
                else {
                    if (j == 0 || j == size - 1) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }


    }
}
