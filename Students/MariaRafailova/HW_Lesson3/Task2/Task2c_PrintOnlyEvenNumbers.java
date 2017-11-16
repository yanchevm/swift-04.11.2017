package Task2;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number:  ");
        String num = sc.nextLine();

        System.out.println("Please enter "+num +" numbers, separated by space:");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i])%2 == 0){
                System.out.print(arr[i]+ " ");
            }
        }


    }
}
