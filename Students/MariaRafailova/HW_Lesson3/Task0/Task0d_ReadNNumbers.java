package Task0;

import java.util.Arrays;
import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number:  ");
        String num = sc.nextLine();

        System.out.println("Please enter "+num +" numbers, separated by space:");

//        ne mi haresva vhoda...

        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
