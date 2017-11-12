package homework.homework2.practise0;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task0c_ReadAge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if (age<18)
            System.out.println("You are underage");
        else{
            System.out.println("You are adult");
        }
    }
}
