package com.company;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Task5_SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        String first = sc.next();
        String second = sc.next();

        String temp = first;
        first = second;
        second = temp;

        System.out.println(first+" "+second);

    }
}
