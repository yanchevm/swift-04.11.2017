import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < Number; i++) {

            int newInt = scanner.nextInt();
            sum+=newInt;
        }
        System.out.println(sum);

    }
}
