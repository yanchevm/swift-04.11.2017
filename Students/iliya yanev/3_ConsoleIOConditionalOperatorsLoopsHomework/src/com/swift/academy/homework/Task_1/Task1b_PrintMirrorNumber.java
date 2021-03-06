package com.swift.academy.homework.Task_1;

import com.swift.academy.homework.Task_0.Task0a_ReadInt;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        System.out.print("Number: ");
        int number = Task0a_ReadInt.validateNumber();
        // Милен: Отново, Integer.parseInt
        String numberAsString = Integer.toString(number);

        //1st way
        byte[] bytes = numberAsString.getBytes();
        byte[] reversedString = new byte[bytes.length];

        // Милен: Добре си се сетил.
        // А можеш ли да започнеш от последния елемент към първия в цикъла ?
        // Как ще достъпваш тогава елементите на reversedString ?
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
