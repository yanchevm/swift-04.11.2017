package com.swift.academy.Task0;

import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int number = sc.nextInt();

        int[] arr = new int[100];

        System.out.print("Please enter " + number + " numbers:");

        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < number; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
}
