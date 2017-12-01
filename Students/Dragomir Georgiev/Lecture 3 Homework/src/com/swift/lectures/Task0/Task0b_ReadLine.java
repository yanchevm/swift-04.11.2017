package com.swift.lectures.Task0;

import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        System.out.println((a + 1));


        String wholeLine = sc.nextLine();
        System.out.println(wholeLine);
    }
}
