package com.swift.academy.strings;

public class Strings{
    public static void main(String[] args){
        
        String str = "Hello, Peter!";
        
        // 'o'
        System.out.println("Fifth symbol is: " + str.charAt(4));
        
        // -1
        System.out.println("The string \"Peter\" starts at: " + str.indexOf("Peterrrrrr"));
        
        // ?
        System.out.println("String ends with \"?\": " + str.endsWith("?"));
        
        // "Hello, Pesho!"
        System.out.println("New string: " + str.replace("Peter", "Pesho P"));
    }
}