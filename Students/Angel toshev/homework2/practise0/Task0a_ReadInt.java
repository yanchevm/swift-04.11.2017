package homework.homework2.practise0;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task0a_ReadInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int num = sc.nextInt();
        System.out.printf("This is number %d increased +1",++num);
    }
}
