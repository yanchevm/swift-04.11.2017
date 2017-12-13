package com.swift.lectures.Task0;

import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        System.out.println((a + 1));


        double age = sc.nextDouble();
        if (age > 0) { //Милен: Ами ако годините са 1000 ?
            if (age > 18) {
                System.out.println("You are an adult");
            } else {
                System.out.println("You're too young, buddy");
            }
        } else {
            System.out.println("Not a valid age");
        }
    }
}
