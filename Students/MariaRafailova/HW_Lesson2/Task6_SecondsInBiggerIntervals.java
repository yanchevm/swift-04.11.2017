package com.company;

import java.util.Scanner;

public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the seconds: ");
        int seconds = sc.nextInt();

        int resSec = seconds%60;
        int mins = seconds/60;
        int resMin = mins%60;
        int hours = mins/60;
        int resHours = hours%24;
        int days = hours/24;

        System.out.println(days+ " days, " + resHours + " hours, "+resMin +" minutes, "+resSec+ " seconds");

    }
}
