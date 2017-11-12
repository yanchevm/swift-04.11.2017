package com.company;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Task2_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = sc.nextInt();

        if((year%4 == 0 && year%100 != 0)||(year%100 == 0 && year%400 == 0)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
