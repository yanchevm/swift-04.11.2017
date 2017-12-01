package com.swift.academy.Task1;

public class Task1c_PrintMatrix {
    public static void main(String[] args) {

        int rows = 4;
        int columns = 4;

        int[][] matrix = {
                {1, 2, 6, 7},
                {3, 5, 8, 13},
                {4, 9, 12, 14},
                {10, 11, 15, 16}
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }

            System.out.println();
        }

    }
}
