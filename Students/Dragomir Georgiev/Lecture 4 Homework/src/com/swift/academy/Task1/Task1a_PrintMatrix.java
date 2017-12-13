package com.swift.academy.Task1;

public class Task1a_PrintMatrix {
    public static void main(String[] args) {

        int columns = 4;
        int rows = 4;

        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[j][i] = j * rows + (i+1);

                System.out.printf("%4d", matrix[j][i]);
            }

            System.out.println();

        }
    }
}

