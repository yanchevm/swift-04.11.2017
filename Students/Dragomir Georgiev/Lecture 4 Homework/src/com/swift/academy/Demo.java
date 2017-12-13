package com.swift.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your grades: ");

        double [] grades = new double[4];

        for(int i = 0; i < grades.length;i++){
            grades[i] = sc.nextInt();
        }

        double sum = Arrays.stream(grades).sum();

        System.out.println(sum);

        double average = (sum / grades.length);

        System.out.println(average);

//        double average = sum / 4;
//
//        System.out.println(average);

        }



//
//        int rowCount = 4;
//        int colCount = 6;
//
//        int[][] matrix = new int[rowCount][colCount];
//
//        for (int i = 0; i < rowCount; i++) {
//            for(int j = 0; j < colCount; j++) {
//                matrix[i][j] = i * colCount + j;
//
//                System.out.printf("%4d", matrix[i][j]);
//            }
//
//            System.out.println();
//        }
//
//        System.out.printf("%4d", matrix[1][1]);
//
//        int[][] matrix2 = new int[2][2];
//        int matrix3[][] = new int[2][2];
//        int [] matrix4 [] = new int[2][2];
//
//        // Arrays
//        System.out.println();
//
//        System.out.println(Arrays.equals(new int[3], new int[3]));
//
//        System.out.println();
//
//        int[] arr = {1,2,3,4,10,20};
//
//        System.out.println(Arrays.toString(arr));

    }
