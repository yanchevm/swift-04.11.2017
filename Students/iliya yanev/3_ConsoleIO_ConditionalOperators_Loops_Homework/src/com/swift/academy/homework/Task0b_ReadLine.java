package com.swift.academy.homework;

import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
    }
}
