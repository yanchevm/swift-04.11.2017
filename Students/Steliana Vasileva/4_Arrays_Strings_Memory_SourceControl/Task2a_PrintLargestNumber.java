package src;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int checker = Integer.MIN_VALUE;
        int N = sc.nextInt();
        int maxNumber = 0;

        for (int i = 0; i < N; i++){

          int number = sc.nextInt();

          if (number>checker && number > maxNumber){
              maxNumber += number;

            }
          }
        System.out.println(maxNumber);


}
    }

