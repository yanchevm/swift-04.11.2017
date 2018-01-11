package homework.homework2.practise2;

import java.util.Scanner;

/**
 * Created by Admin on 12.11.2017 г..
 */
public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = sc.nextInt();

        for (int i=0;i<num;i++){
            int num1 = sc.nextInt();
            if (num1%2==0){ //Милен: БРАВО!
                System.out.println(num1);
            }
        }

    }
}

