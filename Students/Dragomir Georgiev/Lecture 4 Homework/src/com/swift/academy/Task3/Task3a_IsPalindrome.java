package com.swift.academy.Task3;

import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String reverse = "";

        System.out.println("Enter a word to check if it is palindrome: ");

        String word = sc.nextLine();

        int length = word.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + word.charAt(i);

        if (word.equals(reverse)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
