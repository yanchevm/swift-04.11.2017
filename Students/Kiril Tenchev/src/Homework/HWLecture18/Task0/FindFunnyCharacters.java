package Homework.HWLecture18.Task0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindFunnyCharacters {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter some String: ");
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("(\\W+)");
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
}
