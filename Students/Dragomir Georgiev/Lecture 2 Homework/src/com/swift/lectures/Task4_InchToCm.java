package com.swift.lectures;

import java.util.Scanner;

public class Task4_InchToCm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inch = scan.nextInt();

        double cm = inch * 2.54;

        System.out.println(cm);
    }
}
