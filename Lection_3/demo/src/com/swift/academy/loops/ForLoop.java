package com.swift.academy.loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number N and I will give you the sum 1 to N: ");
        int n = sc.nextInt();

        int sum = 0;
        
        for (int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.printf("The sum of 1 to %d is: %d%n", n, sum);

        // ---------------

        int sumDo = 0;
        int i = 0;

        do {
            sumDo += i;
            i++;
        } while (i <= n);


        System.out.printf("The sum of 1 to %d is: %d%n", n, sumDo);

        // ------------------

        int sumWhile = 0;
        i = 1;
        while(i<=n) {
            sumWhile+=i;
            i++;
        }
        System.out.printf("The sum of 1 to %d is: %d%n", n, sumWhile);
    }
}