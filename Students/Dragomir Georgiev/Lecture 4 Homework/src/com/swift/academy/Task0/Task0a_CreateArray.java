package com.swift.academy.Task0;

public class Task0a_CreateArray {
    public static void main(String[] args) {

        int[] myArray = {5, 9, 11, 3, 6, 4, 7};

        int length = myArray.length;
        int index = 0;

        while (index < length) {
            System.out.println(myArray[index]);
            index++;

        }

    }
}
