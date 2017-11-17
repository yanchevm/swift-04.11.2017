package com.swift.academy.homework.Task_1;

import com.swift.academy.homework.Task_0.Task0b_ReadArray;

public class Task1d_PrintMatrix {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int size = Task0b_ReadArray.readNumberFromConsole();
        while (size < 1) {
            System.out.print("Please enter a positive number: ");
            size = Task0b_ReadArray.readNumberFromConsole();
        }

        int arr[][] = spiral(size);

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }

    }

    private static int[][] spiral(int size) {
        int[][] arr = new int[size][size];
        int insideCells = (int)Math.ceil((size / 2.0));
        int sizeIndex = size;
        int count = 1;

        for (int i = 0; i < insideCells; i++) {
            for (int j = 0; j < sizeIndex; j++) {
                arr[i][i+j] = count++;
            }
            for (int j = 1; j < sizeIndex; j++) {
                arr[i + j][size - 1 - i] = count++;
            }
            for (int j = sizeIndex - 2; j >= 0; j--) {
                arr[size - 1 - i][i + j] = count++;
            }
            for (int j = sizeIndex -2; j > 0; j--) {
                arr[i + j][i] = count++;
            }
            sizeIndex -= 2;
        }
        return arr;
    }
}
