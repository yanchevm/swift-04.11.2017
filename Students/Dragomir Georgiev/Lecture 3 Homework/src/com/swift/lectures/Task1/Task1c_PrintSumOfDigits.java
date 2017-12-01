package com.swift.lectures.Task1;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println(sum);
    }
}
