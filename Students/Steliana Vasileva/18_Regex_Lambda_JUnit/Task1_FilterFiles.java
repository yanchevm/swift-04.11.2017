package com.company;

import java.util.Scanner;


public class Task1_FilterFiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String [] input = sc.nextLine().split(".");
            switch ( input[input.length]){
                case ".png":
                case ".gif":
                case ".jpg":
                case ".bmp":
                    System.out.println(input.toString());
                    break;

                }
            }
        }
    }


