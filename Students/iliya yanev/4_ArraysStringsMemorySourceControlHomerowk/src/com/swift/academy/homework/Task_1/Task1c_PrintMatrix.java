package com.swift.academy.homework.Task_1;

import com.swift.academy.homework.Task_0.Task0b_ReadArray;

public class Task1c_PrintMatrix {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int size = Task0b_ReadArray.readNumberFromConsole();
        while (size < 1) {
            System.out.print("Please enter a positive number: ");
            size = Task0b_ReadArray.readNumberFromConsole();
        }

        int arr[][] = new int[size][size];
        arr = diagonal(arr);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.format("%4d", arr[i][j]);
            }
           System.out.println();
       }
    }

    private static int[][] diagonal(int[][] input) {
        int count = 1;
        int numRows = input.length;
        int numColumns = input[0].length;
        int[][] result = new int[numRows][numColumns];

        int rowIndex = 0;
        int columnIndex = 0;

        int currentRow = 0;
        int currentColumn = 0;

        for(int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                result[currentRow][currentColumn] = count++;
                if (currentRow == numRows - 1) {
                    //move current row down
                    currentRow = ++rowIndex;
                    currentColumn = numColumns - 1;
                } else if (currentColumn == 0) {
                    if (columnIndex < numColumns - 1) {
                        currentRow = rowIndex;
                        currentColumn = ++columnIndex;
                    } else {
                        currentColumn = columnIndex;
                        currentRow = ++rowIndex;
                    }
                } else {
                    currentRow++;
                    currentColumn--;
                }
            }
        }
        return result;
    }
}
