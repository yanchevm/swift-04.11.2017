package com.swift.academy.homework.Task_3;

import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine().trim();
        System.out.println("encode or decode: ");
        String mode = sc.nextLine().trim();

        switch (mode) {
            case "encode":
                encode(input);
                System.out.println();
                break;
            case "decode":
                decode(input);
                System.out.println();
                break;
        }
    }

    private static void encode(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                if (c >= 'a' && c <= 'z') {
                    c += 1;
                    if (c > 'z') {
                        c -= 26;
                    } else if (c < 'a') {
                        c += 26;
                    }
                }
            } else if (Character.isUpperCase(c)) {
                if (c >= 'A' && c <= 'Z') {
                    c += 1;
                    if (c > 'Z') {
                        c -= 26;
                    } else if (c < 'A') {
                        c += 26;
                    }
                }
            }
            System.out.print(c);
        }
    }

    private static void decode(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                if (c >= 'a' && c <= 'z') {
                    c -= 1;
                    if (c > 'z') {
                        c += 26;
                    } else if (c < 'a') {
                        c -= 26;
                    }
                }
            } else if (Character.isUpperCase(c)) {
                if (c >= 'A' && c <= 'Z') {
                    c -= 1;
                    if (c > 'Z') {
                        c += 26;
                    } else if (c < 'A') {
                        c -= 26;
                    }
                }
            }
            System.out.print(c);
        }
    }
}
