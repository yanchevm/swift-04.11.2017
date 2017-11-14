package com.swift.academy.arrays;

import java.util.Arrays;

public class MultiDimensionalArray{
    public static void main(String[] args) {

        int rowCount = 4;
        int colCount = 6;

        int[][] matrix = new int[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for(int j = 0; j < colCount; j++) {
                matrix[i][j] = i * colCount + j;

                System.out.printf("%4d", matrix[i][j]);
            }
            
            System.out.println();
        }

        int[][] matrix2 = new int[2][2];
        int matrix3[][] = new int[2][2];
        int [] matrix4 [] = new int[2][2];

        // Arrays
        System.out.println();

        System.out.println(Arrays.equals(new int[3], new int[3]));

        System.out.println();

        int[] arr = {1,2,3,4,10,20};

        System.out.println(Arrays.toString(arr));

    }
}