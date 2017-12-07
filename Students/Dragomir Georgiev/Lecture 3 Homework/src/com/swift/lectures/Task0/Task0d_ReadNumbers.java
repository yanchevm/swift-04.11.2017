package com.swift.lectures.Task0;

import java.util.Scanner;

public class Task0d_ReadNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstRow = sc.nextInt();

        //Милен: Това не е условието на задачата!
        // Трябва след като прочетеш първата цифта, да прочетеш втори ред с числа
        // с брой равен на първата цифра и да ги отпечаташ :)
        for (int i = 1; i < (firstRow + 1); i++) {
            System.out.println(i);


        }
    }
}
