import java.util.Scanner;

public class Task2b_PrintReversedSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] myIntArray = new int[number];

        for (int i = 0; i <= myIntArray[number-1]; i++) {
            myIntArray [i] = scanner.nextInt();
        }

        for (int j = myIntArray.length; j >= myIntArray[0]; j--) {
            System.out.printf("%d"+ " ", j);
            }
        }

    }

