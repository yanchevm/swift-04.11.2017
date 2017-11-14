package com.swift.academy.homework.Task_4;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String[] potentialWords = sc.nextLine().trim().replaceAll("['':;,.!?]", "").split(" ");
        int words = 0;
        for(String word:potentialWords) {
            if (isWord(word)) {
                words++;
            }
        }
        System.out.println("Words: " + words);
    }

    private static boolean isWord(String word) {
        char[] chars = word.toCharArray();
        for(char c:chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
