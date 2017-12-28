package Lesson3.Homework.Task2a_PrintSumOfN;
import java.util.Scanner;


public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number:  ");
        int n = sc.nextInt();
            int sum = 0;
            //Милен: БРАВО!
            for (int i=0; i < n; i++) {
                int number = sc.nextInt();
                sum += number;
            }
            System.out.println(sum);

    }
}
