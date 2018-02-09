package src;
import java.util.Scanner;

public class Task1а_PrintMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number =0;
        int[][] new2dArray = new int[N][N];

        for (int rows = 0; rows < N; rows++) {

            System.out.println();
            number=rows+1;

            for (int columns = 0; columns < N ; columns++){

                new2dArray[rows][columns] = number;
                System.out.printf("%d ", new2dArray[rows][columns]);
                number+=N;

            }

        }

    }
}


