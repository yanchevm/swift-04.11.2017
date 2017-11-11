package com.swift.academy.loops;

import com.sun.org.apache.xpath.internal.SourceTree;

public class TestBreak {

    public static void main(String[] args) {

        int age = 2;

        for (int i = 0; i < 20; i+=2) {
            System.out.println("Current iteration: " + i);

            if (i == age) {
                continue;
            }

            System.out.println("Some calculations...");
        }
    }
}
