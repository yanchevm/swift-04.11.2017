package com.swift.lectures;

import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();



        if (age > 18) {
            if (name.equals("Milen")) {
                System.out.println("Teacher");
            } else {
                System.out.println("Student");
            }
        } else {
            System.out.println("I am under-aged");
        }

        System.out.println();
        System.out.println();
    }
}
