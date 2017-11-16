package Homework.HWLecture3;
import java.util.Scanner;
public class Task1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number =sc.nextInt();
        String str = new Integer(number).toString();
        char c = str.charAt(0);
        System.out.println(c);
    }
}
