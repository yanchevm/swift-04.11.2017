package com.swift.lectures;

import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


    int a = sc.nextInt();
        System.out.println((a+1));


        int firstRow = sc.nextInt();

        for(int i = 1;i < (firstRow+1);i++){
            System.out.print(i+ " ");

        }

    }
}
