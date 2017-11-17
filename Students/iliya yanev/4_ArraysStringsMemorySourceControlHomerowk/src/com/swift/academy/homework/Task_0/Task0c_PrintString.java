package com.swift.academy.homework.Task_0;

import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String input = sc.nextLine().trim();

        char[] letters = input.toCharArray();
        for(char c: letters) {
            System.out.println(c);
        }
    }
}
