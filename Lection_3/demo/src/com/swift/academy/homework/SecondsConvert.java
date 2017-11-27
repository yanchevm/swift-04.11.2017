package com.swift.academy.homework;

import java.util.Scanner;

public class SecondsConvert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();

        int seconds = inputNum % 60;
        inputNum /= 60;

        int minutes = inputNum % 60;
        inputNum /= 60;

        int hours = inputNum % 24;
        inputNum /= 24;

        int days = inputNum;
    }
}
