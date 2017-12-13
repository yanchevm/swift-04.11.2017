package com.swift.lectures;

import java.util.Scanner;

public class Task2_LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(true);
        } else if (year % 100 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}