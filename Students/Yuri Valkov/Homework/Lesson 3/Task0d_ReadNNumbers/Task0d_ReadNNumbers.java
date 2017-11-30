package homework.homework2.Task0d_ReadNNumbers;
import java.util.Scanner;



public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your number: ");
                int numb = sc.nextInt();
        System.out.print(" Enter your numbers in one line: ");
        for ( int i=0; i<numb; i++ ) {
            int number = sc.nextInt();
            String result = "";
            result += number + "\n";
            System.out.println(result);
        }
        }



    }

