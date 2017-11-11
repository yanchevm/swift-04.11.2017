package com.swift.academy.loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double a;
        double sum = 0;
        
        do{
            System.out.printf("Current sum is: %.2f. Enter number or 0 to quit: ", sum);
            
            a = sc.nextDouble();

            if (a == 0) {
                break;
            }

            sum += a;
        } while(true);
        
    }
}