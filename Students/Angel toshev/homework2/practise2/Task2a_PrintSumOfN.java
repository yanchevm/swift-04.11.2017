package homework.homework2.practise2;

import java.util.Scanner;

/**
 * Created by Admin on 12.11.2017 г..
 */
public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = sc.nextInt();
        int sum = 0;
	// Милен: БРАВО!
        for (int i=0;i<num;i++){
            int num1 = sc.nextInt();
            sum+=num1;
        }
        System.out.println(sum);
    }
}
