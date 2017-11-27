package com.swift.academy.homework;

public class SwapValues {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        // Second
        a = 10;
        b = 15;

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println(a);
        System.out.println(b);
    }
}
