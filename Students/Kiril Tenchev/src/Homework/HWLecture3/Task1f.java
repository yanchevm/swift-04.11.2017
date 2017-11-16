package Homework.HWLecture3;
import java.util.Scanner;
public class Task1f {
    private static void printBinaryform(int number) {
        int remainder;
        if (number <= 1) {
            System.out.print(number);
            return;   // KICK OUT OF THE RECURSION
        }
        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
    public static String dec2Hex(int num)
    {
        String hex = "";
        while (num != 0)
        {
            if (num % 16 < 10)
                hex = Integer.toString(num % 16) + hex;
            else
                hex = (char)((num % 16)+55) + hex;
            num = num / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = in.nextInt();

        if (number < 0) {
            System.out.println("Error: Not a positive integer");
        } else {

            System.out.print("Convert to binary is: ");
            printBinaryform(number);
            System.out.println();
            System.out.println("Convert to HEX is: "+dec2Hex(number));

        }
    }
}