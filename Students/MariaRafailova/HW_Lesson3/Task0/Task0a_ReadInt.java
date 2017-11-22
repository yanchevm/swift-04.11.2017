package Task0;

import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        int result = ++num;

        System.out.println(result);

    }
}
