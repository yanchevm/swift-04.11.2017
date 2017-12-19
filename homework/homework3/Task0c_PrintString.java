package homework.homework3;

import java.util.Scanner;

/**
 * Created by Admin on 23.11.2017 г..
 */
public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0;i<str.length();i++){
            System.out.println(str.charAt(i));

        }
    }
}
