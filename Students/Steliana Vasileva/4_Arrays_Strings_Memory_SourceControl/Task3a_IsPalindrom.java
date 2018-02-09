package src;

import java.util.Scanner;

public class Task3a_IsPalindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String newString = sc.nextLine();

        char[] newCharArray = newString.toCharArray();
        char[] firstHalf;
        char[] secondHalf;

        if (newCharArray.length % 2 != 0) {

            firstHalf = new char[(newCharArray.length) / 2];

            for (int i = 0; i < newCharArray.length / 2; i++) {
                firstHalf[i] = newString.charAt(i);
            }

            secondHalf = new char[(newCharArray.length) / 2];
            for (int i = 0; i < newCharArray.length / 2; i++) {
                secondHalf[i] = newString.charAt((newString.length() / 2) + i + 1);
            }


            for (int c = 0; c < firstHalf.length; c++) {
                if (firstHalf[c] == secondHalf[firstHalf.length - 1 - c]) {

                    System.out.println("true");
                } else
                    System.out.println("false");
            }
        } else {
            firstHalf = new char[(newCharArray.length) / 2];

            for (int i = 0; i < newCharArray.length / 2; i++) {
                firstHalf[i] = newString.charAt(i);
            }

            secondHalf = new char[(newCharArray.length) / 2];
            for (int i = 0; i < newCharArray.length / 2; i++) {
                secondHalf[i] = newString.charAt((newString.length() / 2) + i);
            }
            for (int c = 0; c < firstHalf.length; c++) {
                if (firstHalf[c] == secondHalf[firstHalf.length - 1 - c]) {

                    System.out.println("true");
                } else
                    System.out.println("false");
            }
        }
    }
}
