package task05;

import java.util.Scanner;

/**
 * Created by neda.andreeva on 11/06/2017.
 */
public class Task5_SwapVariables2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        // Милен: Точно за такова решение се пита на интервю за работа - БРАВО!
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;

        System.out.println(firstNum + " " + secondNum);
    }
}
