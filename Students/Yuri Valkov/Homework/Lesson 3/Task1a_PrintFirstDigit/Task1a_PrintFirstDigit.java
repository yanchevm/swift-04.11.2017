package homework.homework2.Task1a_PrintFirstDigit;
import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
            int number = sc.nextInt();
            byte firstdigit = 0;
                while (number != 0) {
                    firstdigit = (byte) (number % 10);
                    number /= 10;
                }

            System.out.println(firstdigit);


    }
}
