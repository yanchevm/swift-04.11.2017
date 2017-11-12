package com.company;

import java.util.Scanner;

public class Task4_InchToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a inch: ");
        double inch = sc.nextDouble();

        float result = (float)(inch*2.54);

        System.out.println(result);

    }
}
