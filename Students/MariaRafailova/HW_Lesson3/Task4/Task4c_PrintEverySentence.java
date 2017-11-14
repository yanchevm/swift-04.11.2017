package Task4;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter some text: ");
        String str = sc.nextLine();

        String[] arr = str.split("[.?!]");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].trim());
        }

        //izchezvat tochkite ot kraia na izrechenieto v rezultata
    }
}
