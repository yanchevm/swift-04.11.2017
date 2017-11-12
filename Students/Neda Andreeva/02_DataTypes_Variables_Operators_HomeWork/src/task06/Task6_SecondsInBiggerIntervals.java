package task06;

import java.util.Scanner;

/**
 * Created by neda.andreeva on 11/06/2017.
 */
public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();

        int seconds = inputNum % 60;
        inputNum /= 60;

        int minutes = inputNum % 60;
        inputNum /= 60;

        int hours = inputNum % 24;
        inputNum /= 24;

        int days = inputNum;

        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
