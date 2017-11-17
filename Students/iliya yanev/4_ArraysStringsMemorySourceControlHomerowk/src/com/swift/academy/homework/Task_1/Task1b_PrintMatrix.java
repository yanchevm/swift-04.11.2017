package com.swift.academy.homework.Task_1;

import com.swift.academy.homework.Task_0.Task0b_ReadArray;

public class Task1b_PrintMatrix {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int size = Task0b_ReadArray.readNumberFromConsole();
        while (size < 1) {
            System.out.print("Please enter a positive number: ");
            size = Task0b_ReadArray.readNumberFromConsole();
        }
        int arr[][] = new int[size][size];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                    if (j % 2 == 0) {
                        arr[i][j] = 1 + i + j * size;
                        System.out.format("%4d", arr[i][j]);
                    }
                    else {
                        arr[i][j] =  size * (j + 1) - i;
                        System.out.format("%4d", arr[i][j]);
                    }
            }
            System.out.println();
        }
    }
}
