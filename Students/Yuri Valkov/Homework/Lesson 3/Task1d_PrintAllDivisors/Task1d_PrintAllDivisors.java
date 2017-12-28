package homework.homework2.Task1d_PrintAllDivisors;
import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please, enter your number: ");
        int n = sc.nextInt();
        int count = 0; //Милен: Защо ти е тази променлива ?
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                count++;
            System.out.print(i + " ");

            }
        }
    }
}