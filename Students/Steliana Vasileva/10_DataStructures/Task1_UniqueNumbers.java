package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Integer> newSet = new HashSet<>();
        Integer [] numbersList = new Integer[n];

        for (int i = 0; i < numbersList.length; i++){
            numbersList[i]=sc.nextInt();
        }

        newSet.addAll(Arrays.asList(numbersList));
        System.out.println(newSet.toString());
        }


    }

