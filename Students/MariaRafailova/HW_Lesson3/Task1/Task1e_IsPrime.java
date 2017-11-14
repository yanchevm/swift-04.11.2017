package Task1;

import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                prime = false;
                break;
            }
        }

        System.out.println(prime);
    }
}
