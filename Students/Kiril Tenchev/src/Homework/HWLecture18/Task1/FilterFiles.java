package Homework.HWLecture18.Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterFiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        String [] arrayStr = new String[n];
        Pattern pattern = Pattern.compile("(\\w+).?(jpg|png|gif|bmp)");
        Matcher matcher ;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter row "+(i+1)+": ");
            arrayStr[i] = sc.next();
        }

        System.out.println();

        for (int i = 0; i < n ; i++) {
            matcher = pattern.matcher(arrayStr[i]);
            if(matcher.find()){
                System.out.println(matcher.group());
            }
        }


    }
}
