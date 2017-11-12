package task05;

import java.util.Scanner;

/**
 * Created by neda.andreeva on 11/06/2017.
 */
public class Task5_SwapVariables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println(firstNum + " " + secondNum);
    }
}
