package com.swift.academy.Task1;

public class Task1d_PrintMatrix {
    public static void main(String[] args) {

        int rows = 4;
        int columns = 4;

        int[][] matrix = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }

            System.out.println();
        }
    }
}
