package com.swift.academy.Task0;

public class Task0d_Print2dArray {
    public static void main(String[] args) {

        int rows = 4;
        int columns = 4;


        int[][] matrix = new int[rows][columns];
//        matrix[0][0] = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i * columns + j;

                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}