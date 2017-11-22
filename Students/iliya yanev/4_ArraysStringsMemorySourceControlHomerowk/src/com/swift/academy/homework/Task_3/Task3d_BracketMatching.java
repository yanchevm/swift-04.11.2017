package com.swift.academy.homework.Task_3;

import java.util.Scanner;
import java.util.Stack;

public class Task3d_BracketMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine().trim();
        System.out.println(validateBrackets(input));
    }

    private static boolean validateBrackets(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == '}' || string.charAt(i) == ']' || string.charAt(i) == ')') {
                if (stack.size() == 0)
                    return false;
                switch (stack.pop()) {
                    case '(':
                        if (string.charAt(i) != ')')
                            return false;
                        break;
                    case '[':
                        if (string.charAt(i) != ']')
                            return false;
                        break;
                    case '{':
                        if (string.charAt(i) != '}')
                            return false;
                        break;
                }
            }
        }
        return stack.size() == 0;
    }
}
