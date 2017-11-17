package com.swift.academy.homework.Task_1;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int inputNumber = Task0a_ReadInt.validateNumber();

        //slow
        System.out.print("Number's divisors are: ");
        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Милен: БРАВО! Много добре си се сетил
        //faster
        List divisors = new ArrayList();
        System.out.print("Number's divisors are: ");
        double limit = Math.sqrt(inputNumber);
        for (int i = 1; i <= limit + 1; i++) {
            if (inputNumber % i == 0) {
                if (inputNumber / i == i) {
                    divisors.add(i);
                }
                else {
                    divisors.add(i);
                    divisors.add(inputNumber / i);
                }
            }
        }
        Collections.sort(divisors);
        System.out.print(divisors);
        System.out.println();
    }
}
