package com.swift.academy.loops;

import java.util.Scanner;

public class DemoDoWhileWhile {
    public static void main(String[] args) {
        char randChar = 'c';
        int attempts = 0;

        Scanner sc = new Scanner(System.in);
        char myChar;

        System.out.println("I have a letter in mind. Can you guess it?");

        do {
            myChar = sc.next().charAt(0);
            if (myChar != randChar) {
                System.out.println("Try again.");
            }
            attempts++;
        } while (myChar != randChar);

        System.out.printf("Attempts: %d%n", attempts);

    }
}
