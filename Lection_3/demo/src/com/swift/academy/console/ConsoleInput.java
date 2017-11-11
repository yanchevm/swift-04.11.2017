package com.swift.academy.console;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

//        System.out.print("Please enter your name: ");
//        String name = sc.next();
//        System.out.println("Hello, " + name);
//
//        System.out.print("Please enter your age: ");
//        int age = sc.nextInt();
//        System.out.format("You are %d years old.%n", age);
//
//        System.out.print("Double check, please enter your age: ");
//        age = sc.nextInt();
//        System.out.format("You are %d years old.%n", age);


	    while (sc.hasNext()) {
                System.out.print("Enter input: ");

                String input = sc.next();

	            if (input.equals("exit")) {
	                    break;
                }

                System.out.println(input);
        }
	}
}
