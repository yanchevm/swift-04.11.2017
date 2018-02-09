package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0b_FindFunnyCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Pattern intPattern = Pattern.compile("\\W");
        Matcher newMatcher = intPattern.matcher(input);

        while(newMatcher.find()){
            System.out.print(newMatcher.group());
        }
    }
}
