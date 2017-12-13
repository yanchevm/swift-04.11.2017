package homework.homework2.practise1;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        toBinaryAndHexa(number,2);
        toBinaryAndHexa(number,16);


    }

    private static void toBinaryAndHexa(int num, int reversal) {
        char digit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rest ;
        String result = "";
        while (num>0){
            rest=num%reversal;
            result+=digit[rest];
            num/=reversal;
        }
        System.out.println(result);
    }
}