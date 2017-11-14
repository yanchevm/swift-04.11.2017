package com.swift.academy.arrays;

import java.util.Arrays;

public class OneDimensionalArray{

    public static void main(String[] args) {
        
        int[] arr = { -5, 0, -5, 4, 16, 10, 2, 11, -11, 9, -4, -3, 27, 4, -4};
        arr[0] = -5;

        int n = arr.length;

        for (int index = 0; index < n; index++) {
            if(arr[index] < 0) {
                System.out.print("-");
            } else if(arr[index] == 0) {
                System.out.print("0");
            } else {
                System.out.print("+");
            }
            
            System.out.print(" ");
        }


        // Using while
        int index = 0;

        while(index < arr.length) {
            System.out.print(arr[index]);

            index++;
        }

        // Filling
        for (int counter = 0; counter < arr.length; counter++) {
            arr[counter] = counter + 2;
        }

        arr[0] = 1;

    }
}