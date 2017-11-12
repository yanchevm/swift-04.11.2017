package homework.homework2.practise1;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
       while (num!=0){
           sum+=num%10;
           num/=10;
       }
        System.out.println(sum);

    }
}
