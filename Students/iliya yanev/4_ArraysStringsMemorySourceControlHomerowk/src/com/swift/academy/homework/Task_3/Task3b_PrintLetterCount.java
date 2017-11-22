package com.swift.academy.homework.Task_3;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine().trim().toLowerCase();
        int[] count = new int[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            count[charAt]++;
        }
        for (char i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("%c(%d)", i, count[i]);
                System.out.println();
            }
        }
    }
}
