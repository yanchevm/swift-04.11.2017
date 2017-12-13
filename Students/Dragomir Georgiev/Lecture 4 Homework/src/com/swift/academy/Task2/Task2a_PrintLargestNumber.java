package com.swift.academy.Task2;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int count = sc.nextInt();

        System.out.printf("Please enter %d numbers: ", count);

        int[] array = new int[count];
        int max = array[0];

        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }


        for (int i = 0; i < count; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The biggest number is: " + max);

    }
}
