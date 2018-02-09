package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0a_FindIntegers {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    Pattern intPattern = Pattern.compile("\\d+");
    Matcher newMatcher = intPattern.matcher(input);

    while (newMatcher.find()){
        System.out.println(newMatcher.group());

    }

    }
}
