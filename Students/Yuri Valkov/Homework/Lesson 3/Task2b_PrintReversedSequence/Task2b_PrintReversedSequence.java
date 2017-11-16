package Lesson3.Homework.Task2b_PrintReversedSequence;
import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Please, eneter your number: ");
        int num = sc.nextInt();
        String mirror = "";
            System.out.println("Please enter the numbers: ");
                for( int i =0; i < num; i++) {
                    int number = sc.nextInt();
                    mirror = number + " " + mirror;
                }
            System.out.println(mirror);

    }
}
