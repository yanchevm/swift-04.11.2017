package com.swift.academy.homework.Task_4;

import java.time.Year;
import java.util.Collections;
import java.util.Scanner;

import static com.swift.academy.homework.Task_0.Task0b_ReadArray.readNumberFromConsole;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Count: ");
        int count = readNumberFromConsole();
        while (count < 1) {
            System.out.print("Please enter a positive number: ");
            count = readNumberFromConsole();
        }
        String output = "";
        System.out.println("Input: ");

        for (int i = 0; i < count; i++) {
            String inputString = sc.nextLine();
            String[] input = inputString.split(";");
            int dob = Year.now().getValue() - Integer.parseInt(input[3]);
            double[] grades = new double[4];
            double sum = 0.0;
            for (int j = 7; j < input.length; j++) {
                grades[j - 7] = Double.parseDouble(input[j]);
                sum += grades[j - 7];
            }
            double average = sum / grades.length;
            double weight = Double.parseDouble(input[4]);

            if (input[2].equals("M")) {
                output += String.format("%s %s is %d years old. His weight is %.1f and he is %s cm tall. He is a %s with an average grade of %.3f.", input[0], input[1], dob, weight, input[5], input[6], average);
            }
            else {
                output += String.format("%s %s is %d years old. Her weight is %.1f and she is %s cm tall. She is a %s with an average grade of %.3f.", input[0], input[1], dob, weight, input[5], input[6], average);
            }
            if (dob < 18) {
                output += String.format(" %s %s is under-aged.\n", input[0], input[1]);
            } else {
                output += "\n";
            }
        }
        System.out.println(output);
    }
}