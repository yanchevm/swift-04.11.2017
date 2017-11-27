package com.swift.academy.loops;

import java.util.Scanner;
import java.util.Random;

public class WhileLoop {
	public static void main(String[] args){
        
        Random randGen = new Random();
        char randomChar = (char) (randGen.nextInt(26) + 'a');
        
        System.out.println("I have a letter in mind. Can you guess it?");
        
        int attempts = 0;
        
        Scanner sc = new Scanner(System.in);

        while(sc.next().charAt(0) != randomChar){

            System.out.println("This is not it. Try again.");
            attempts++;

        }
        
        System.out.printf("You finally got it! It took you %d attempts.%n", attempts );

        attempts = 0;

        while(sc.next().charAt(0) != randomChar){

            System.out.println("This is not it. Try again.");
            attempts++;

        }

        System.out.printf("You finally got it! It took you %d attempts.%n", attempts );
    }
}