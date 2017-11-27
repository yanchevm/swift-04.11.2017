import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] myIntArray = new int[number];

        for (int i = 0; i <= myIntArray[number-1]; i++) {
            myIntArray [i] = scanner.nextInt();
        }

        for (int i = myIntArray[0]; i <= myIntArray.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d"+ " ", i);
            }
        }
    }
}
