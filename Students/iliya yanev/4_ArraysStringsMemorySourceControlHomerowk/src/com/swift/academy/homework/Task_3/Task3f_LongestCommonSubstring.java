package com.swift.academy.homework.Task_3;

import java.util.Scanner;

public class Task3f_LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();
        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();

        String substring = findLargestCommonSubstring(firstString, secondString);
        System.out.println(substring);
    }

    private static String findLargestCommonSubstring(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return findLargestCommonSubstring(str2, str1);
        }
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int len = str1.length() - i; len > 0; len--) {
                for (int j = 0; j < str2.length() - len; j++) {
                    if (str1.regionMatches(i, str2, j, len) && len > result.length()) {
                        result = str1.substring(i, i + len);
                    }
                }
            }
        }
        return result;
    }
}
