package Task1;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = sc.nextInt();

        int mod;
        int sum = 0;

	//Милен: БРАВО! А има ли конкретна причина да избереш do-while ? Можеше ли да стане с while ?
        do{
            mod = num%10;
            sum +=mod;
            num /= 10;
        }while (num > 0);

        System.out.println(sum);
    }
}
