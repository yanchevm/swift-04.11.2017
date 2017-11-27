package com.swift.academy.conditions;

import java.util.Scanner;

public class ConditionalOperatorsDemo {

    public static void main(String[] args) {
        System.out.print("Hello and welcome to my pub. Please enter your age: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("This is not a valid age.");
        } else if(age < 2) {
            System.out.println("Impossible! You are talking?!");
        } else if(age < 18) {
            System.out.print("How about a JUICE? [yes/no] ");
        } else if(age < 120) {
            System.out.print("Would you like some WHISKEY? [yes/no] ");
        } else {
            System.out.println("You are the oldest man alive!");
        }

        String answer = sc.next();

        switch (answer) {
            case "y":
            case "Y":
            case "YES":
            case "yes":
                System.out.println("Here is your drink!");
                break;
            case "n":
            case "N":
            case "NO":
            case "no":
                System.out.println("Get out of my pub then!");
                break;
            default:
                System.out.println("Didn't expect that answer ...");
                break;
        }
    }
}
