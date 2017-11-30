package com.swift.academy.homework.Task_4;

import java.util.Scanner;

public class Task4a_StringVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");

        // Милен: БРАВО! Много добре си се сетил.
        String str = sc.nextLine().replaceAll("[AEIOUaeiou]", "");
        System.out.println(str);
    }
}
