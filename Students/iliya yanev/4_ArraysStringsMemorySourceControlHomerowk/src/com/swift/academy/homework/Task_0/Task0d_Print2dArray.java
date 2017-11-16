package com.swift.academy.homework.Task_0;

public class Task0d_Print2dArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int count = 1;
        for(int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = count++;
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
