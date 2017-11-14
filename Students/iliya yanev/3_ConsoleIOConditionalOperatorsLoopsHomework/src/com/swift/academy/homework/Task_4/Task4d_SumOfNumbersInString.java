package com.swift.academy.homework.Task_4;

import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String[] str = sc.nextLine().trim().split("[^-?\\d]+");
        int sum = 0;
        for (String s:str) {
            try {
                sum += Integer.parseInt(s);
            }
            catch (NumberFormatException e) {}
        }
        System.out.println("Sum: " + sum);
    }
}
