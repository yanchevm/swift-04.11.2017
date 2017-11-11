package com.swift.academy.homework;

public class ResultFromCode {

    public static void main(String[] args) {
        // Task a
        int a = 5;
        int b = 10;
        int c = ++a * b--;

        System.out.println(c); // 60


        //Task b
        System.out.println("1 + 2 = " + 1 + 2); // 1 + 2 = 12
        System.out.println("1 + 2 = " + (1 + 2)); // 1 + 2 = 3

        // Task c
        System.out.println(1 + 2 + "abc"); //3abc
        System.out.println("abc" + 1 + 2); //abc12


        // Task d
        int x = 7;
        float y = 5.6f;
        float z = x * y;
        System.out.println(z + " " + (x * y) );
    }

}
