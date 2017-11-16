package Homework.HWLecture3;
import java.util.Scanner;
public class Task3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < input-2; i++) {
            for (int j = 0; j < input - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < input-5; i++) {
            for (int j = 0; j < input - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2* i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

}
