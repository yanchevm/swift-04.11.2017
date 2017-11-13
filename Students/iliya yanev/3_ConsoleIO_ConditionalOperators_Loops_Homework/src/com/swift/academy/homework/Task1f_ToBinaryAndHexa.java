package com.swift.academy.homework;

import java.util.ArrayList;
import java.util.List;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = Task0a_ReadInt.validateNumber();

        // 1st way
        System.out.println(Integer.toString(number, 2));
        System.out.println(Integer.toString(number, 16).toUpperCase());

        // 2nd way
       transformTo(number, 2);
       transformTo(number, 16);
    }

    private static void transformTo(int number, int radix) {
        char digits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int remainder;
        String result = "";
        while (number > 0) {
            remainder = number % radix;
            result = digits[remainder] + result;
            number /= radix;
        }
        System.out.println("Result: " + result);
    }

}
