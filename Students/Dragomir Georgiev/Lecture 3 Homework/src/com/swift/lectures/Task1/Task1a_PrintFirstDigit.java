package com.swift.lectures.Task1;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // Милен: Добре, но можеш ли да се досетиш за по-лесен начин, като използваш стринг ?
        // charAt ? - прочети документацията на този метод
        int result = Integer.parseInt(Integer.toString(number).substring(0,1));

        System.out.println(result);
    }
}