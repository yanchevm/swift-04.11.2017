package task02;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.err.println("ERROR! You must enter a positive number!");
        }
        else {
            int sum = 0;
    
            System.out.print("Please, enter a sequence of numbers: ");
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();
                sum += number;
            }
    
            System.out.println(sum);
        }
    }
}
