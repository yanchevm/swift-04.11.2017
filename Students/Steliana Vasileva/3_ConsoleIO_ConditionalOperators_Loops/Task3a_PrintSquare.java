import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());


    for (int i =0; i < N; i++) {
        System.out.print("* ");
    }
        System.out.println();
    for (int j = 0; j< N-2; j++) {

        for (int k = 0; k < j; k++) {
            System.out.print("*       *");

            System.out.println();


        }
    }

        for (int i =0; i < N; i++) {
            System.out.print("*" + " ");
        }

    }
}
