package com.swift.academy.strings;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedStrings{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 5 comma separated numbers: ");
        
        String str = sc.nextLine();
        
        String[] split = str.split(",");
        
//        int a = Integer.parseInt(split[0].trim());
//        int b = Integer.parseInt(split[1].trim());
//        int c = Integer.parseInt(split[2].trim());
//        int d = Integer.parseInt(split[3].trim());
//        int e = Integer.parseInt(split[4].trim());
//        System.out.println("The sum of your numbers is: " + (a + b + c + d + e));

        // second way
        int sum =0;
        for(int idx = 0; idx < split.length; idx++) {
//            String s = split[idx];
//            String s2 = s.trim();
//
//            int value = Integer.parseInt(s2);
//
//            sum += value;

            sum += Integer.parseInt(split[idx].trim());
        }

        System.out.println(sum);
    }
}