package Task1;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        int mod;
        do{
            mod = num%10;
            System.out.print(mod);
            num /= 10;
        }while (num > 0);

    }
}
