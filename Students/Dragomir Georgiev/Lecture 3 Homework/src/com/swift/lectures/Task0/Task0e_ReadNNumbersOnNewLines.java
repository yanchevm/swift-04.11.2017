package com.swift.lectures.Task0;

import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int firstRow = sc.nextInt();

        //Милен: Отново, не е условието на задачата!
        for (int i = 1; i < (firstRow + 1); i++) {
            System.out.print(i + " ");
        }
    }
}