package com.swift.academy.homework;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        // First
        boolean isLeap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.println(isLeap);

        // Second
        boolean c1 = (year % 4) == 0;
        boolean c2 = (year % 100) == 0;
        boolean c3 = (year % 400) == 0;

        isLeap = (c1 && !c2) || c3;

        System.out.println(isLeap);
    }
}
