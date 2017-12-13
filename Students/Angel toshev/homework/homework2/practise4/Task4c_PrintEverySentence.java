package homework.homework2.practise4;

import java.util.Scanner;

/**
 * Created by Admin on 26.11.2017 г..
 */
public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some text");
        String str = sc.nextLine();
        String [] arr = str.split("[.?!]");
        for (int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);

        }


    }
}
