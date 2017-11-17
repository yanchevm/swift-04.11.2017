package homework.homework2.Task0e_ReadNNumbersOnNewLines;
import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your number: ");
            int numb = sc.nextInt();
        String result = " ";
        System.out.println(" Enter each number on new line : ");
            for (int i = 0; i < numb; i++) {
                int number = sc.nextInt();
                result += number + " ";
            }
                System.out.println(result);

        }
    }
