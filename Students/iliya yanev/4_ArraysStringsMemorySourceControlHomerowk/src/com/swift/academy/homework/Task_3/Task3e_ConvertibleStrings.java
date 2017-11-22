package com.swift.academy.homework.Task_3;

import java.util.Scanner;

public class Task3e_ConvertibleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstInput = sc.nextLine();
        char[] firstStr = firstInput.toCharArray();
        System.out.print("Enter second string: ");
        String secondInput = sc.nextLine();
        char[] secondStr = secondInput.toCharArray();
        int count = 0;
        boolean result = false;
        for (int j = 0; j < firstStr.length; j++) {
            if (secondStr[count] == firstStr[j]) {
                firstStr[j] = 0;
                count++;
                if (count == secondStr.length){
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
