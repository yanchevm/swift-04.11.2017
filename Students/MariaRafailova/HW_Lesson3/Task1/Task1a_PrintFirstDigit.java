package Task1;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a multi-digit number: ");
        char first = sc.next().charAt(0);

        System.out.println(first);
    }
}
