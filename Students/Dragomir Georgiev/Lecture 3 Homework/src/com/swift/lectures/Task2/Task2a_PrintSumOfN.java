package com.swift.lectures.Task2;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        //Милен: Отново какво в предишната подобна задача, условието не е правилно.
        // Трябва да прочетеш толкова на брой числа колкото е посочено първоначално и да изведеш
        // тяхната сума.
        for(int i = 1; i < (number+1);i++){
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}
