package com.swift.lectures.Task4;

import java.util.Scanner;

public class Task4a_StringToVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your sentence: ");
        String word = sc.nextLine();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    result += "";
                    break;
                default:
                    result += word.charAt(i);
                    break;


            }

        }
        System.out.println(result);
    }
}