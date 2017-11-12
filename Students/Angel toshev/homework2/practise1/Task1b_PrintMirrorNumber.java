package homework.homework2.practise1;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        while(first > 0)
        {
            System.out.print(first%10);
            first = first / 10;//
        }
    }
}
