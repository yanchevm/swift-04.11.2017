package com.swift.academy.homework.Task_3;

import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine().trim();
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; ++i) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
