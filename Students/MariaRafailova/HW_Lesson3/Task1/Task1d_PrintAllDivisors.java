package Task1;

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
