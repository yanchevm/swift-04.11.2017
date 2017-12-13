package com.swift.lectures.Task1;

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int divisor = 1; //Милен: Имаш ли нужда от divisor ?
                        // Можеш ли да използваш i вместо това?

        for (int i = 1; i <= number; i++) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        }
    }
}
