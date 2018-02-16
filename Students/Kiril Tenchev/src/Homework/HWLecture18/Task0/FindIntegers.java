package Homework.HWLecture18.Task0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIntegers {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter some String: ");
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("-?[0-9]+");
        Matcher matcher = pattern.matcher(str);

       while(matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
