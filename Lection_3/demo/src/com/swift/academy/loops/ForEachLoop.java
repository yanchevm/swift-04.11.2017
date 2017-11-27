package com.swift.academy.loops;

public class ForEachLoop {
	public static void main(String[] args){
        
        int[] arr = { -5, 10, 2, 11, -11, 9, -4, -3, 27, 4, -4};

        for(int number : arr){
            if(number < 0) {
                System.out.print("-");
            }
            else if(number == 0) {
                System.out.print("0");
            }
            else {
                System.out.print("+");
            }

            System.out.print(" ");
        }
    }
}