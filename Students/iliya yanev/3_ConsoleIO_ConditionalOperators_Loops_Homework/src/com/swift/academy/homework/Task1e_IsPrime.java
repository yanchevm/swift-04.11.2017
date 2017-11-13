package com.swift.academy.homework;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = Task0a_ReadInt.validateNumber();
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        double limit = Math.sqrt(number);
        for(int i = 2; i < limit; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
