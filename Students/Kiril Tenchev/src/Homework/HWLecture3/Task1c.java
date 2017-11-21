package Homework.HWLecture3;
import java.util.Scanner;
public class Task1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =sc.nextInt();
        int sum = 0;

        //Милен: БРАВО!
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
