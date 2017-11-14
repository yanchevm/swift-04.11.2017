package com.swift.academy.homework.Task_4;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String[] sentences = sc.nextLine().trim().split("(?<=[.!?])\\s");
        for (String s:sentences) {
            System.out.println(s);
        }
    }
}
