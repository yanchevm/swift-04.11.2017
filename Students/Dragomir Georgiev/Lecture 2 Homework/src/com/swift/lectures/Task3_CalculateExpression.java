package com.swift.lectures;

public class Task3_CalculateExpression {
    public static void main(String[] args) {

        int firstPart = (3291 + 88581) / 14;
        int secondPart = (1116 % 171) * 5;
        int thirdPart = 312 / (4 + 18);

        int result = firstPart + secondPart - thirdPart;

        System.out.println(result);
    }
}
