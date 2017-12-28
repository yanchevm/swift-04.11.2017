package homework.homework2.Task1e_IsPrime;
import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
            int num = scan.nextInt();
            int temp =2;
            //Милен: БРАВО, алгоритъма е правилен!
            while (temp < num) {
                if (num % temp == 0) {
                    isPrime = false;
                    break;
                }
                temp++;
            }

            System.out.println(isPrime);


    }
}
