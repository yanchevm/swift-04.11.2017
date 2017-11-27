package homework.homework2.practise1;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimalNumber = input.nextInt();//18 10010
        int result = 0;
        int powerOfTen = 1;
        while(decimalNumber > 0)
        {
            int a = decimalNumber % 2;
            result += (a*powerOfTen);
            powerOfTen *= 10;

            decimalNumber /= 2;
        }
        System.out.println(result);
    }
}
