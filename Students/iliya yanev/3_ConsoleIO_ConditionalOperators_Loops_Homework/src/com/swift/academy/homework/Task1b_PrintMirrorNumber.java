package com.swift.academy.homework;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        System.out.print("Number: ");
        int number = Task0a_ReadInt.validateNumber();
        String numberAsString = Integer.toString(number);

        //1st way
        byte[] bytes = numberAsString.getBytes();
        byte[] reversedString = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            reversedString[i] = bytes[bytes.length - 1 - i];
        }
        System.out.println("Reversed: " + new String(reversedString));

        //2nd way
        StringBuilder secondReversedString = new StringBuilder();
        secondReversedString.append(numberAsString);
        secondReversedString = secondReversedString.reverse();

        System.out.println("Reversed using string builder: " + secondReversedString);
    }
}
