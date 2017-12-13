package com.swift.academy.Task1;

public class Task1b_PrintMatrix {
    public static void main(String[] args) {

        int rows = 4;
        int columns = 4;

        int[][] matrix = {
                {1, 8, 9, 16},
                {2, 7, 10, 15},
                {3, 6, 11, 14},
                {4, 5, 12, 13}
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }

            System.out.println();
        }
    }

}
