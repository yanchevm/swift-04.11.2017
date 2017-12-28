package homework.homework2.Task1c_PrintSumOfDigits;
import java.util.Scanner;

    public class Task1c_PrintSumOfDigits {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter your number: ");
            int number = sc.nextInt();
            short amount = 0;
            //Милен: БРАВО! Използваш и правилен тип на променливата!
                while (number != 0) {
                    byte digit = (byte)(number % 10);
                    amount += digit;
                    number /= 10;
                }
                    System.out.println(amount);



        }
    }