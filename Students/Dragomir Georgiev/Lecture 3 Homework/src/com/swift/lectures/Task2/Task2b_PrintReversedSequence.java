package com.swift.lectures.Task2;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int opposite = 0;

        for (int i = 1; i < (number + 1); i++) {
            System.out.println(i + " ");
        }
        while (number != 0) {
            opposite = opposite * 10;
            opposite = opposite + (number % 10);
            number = number / 10;
        }
        System.out.println(opposite);

    }
}