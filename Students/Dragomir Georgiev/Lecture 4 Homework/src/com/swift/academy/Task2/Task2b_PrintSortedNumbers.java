package com.swift.academy.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int count = sc.nextInt();

        System.out.printf("Please enter %d numbers: ", count);

        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();

        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
