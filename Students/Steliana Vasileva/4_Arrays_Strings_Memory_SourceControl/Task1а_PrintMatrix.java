import java.util.Scanner;

public class Task1а_PrintMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] new2dArray = new int[N][N];

        int number = 1;

        for (int rows = 0; rows < N; rows++) {
            System.out.println();

            for (int columns = 0; columns < N; columns++) {

                new2dArray[rows][columns] = number++;
                System.out.printf("%d" + " ", new2dArray[rows][columns]);

            }
        }
    }
}

