package com.swift.academy.homework;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Vavedete godina!");
        // Изполваш конзолата за да четеш годината - БРАВО.

        int year=sc.nextInt();

        // Какво би станало ако потребителя въведе невалидна година ?
        // Примерно: -40 или 0
        if(year % 4==0){
            if((year % 100 == 0)&&( year % 400 !=0)){
                System.out.println(false);
            }
            if(year % 400==0){
                System.out.println(true);
            }
            if(year % 100!=0){
                System.out.println(true);
            }

        }else{
            System.out.println(false);
        }
    }
}
