package com.swift.lectures.Task1;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int reverse = 0;

        //Милен - БРАВО!
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + (number % 10);
            number = number / 10;
        }
        System.out.println("Reverse value is " + reverse);
    }
}
