package com.company;

import java.util.Scanner;

public class Task0_NumberNotANumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");

        String input = sc.nextLine();

        do {
            try {
                input = sc.next();
                Integer.parseInt(input);
            } catch (NumberFormatException notANumber) {

                System.out.println("Not a number");
            }
            System.out.println("Number");
            System.out.println("Please enter a new number");

        } while (!input.equals("END"));
    }
}
