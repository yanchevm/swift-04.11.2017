package homework.homework2.practise1;

import java.util.Scanner;

/**
 * Created by Admin on 19.11.2017 г..
 */
public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();


        for (int i = 1;i<=number;i++){
            if (number%i==0)
                System.out.print(i+" ");
        }

    }
}
