package src;
import java.util.Scanner;

public class Тask1b_PrintMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int number = 0;
        int[][] new2dArray = new int[N][N];

        for (int rows = 1; rows <= new2dArray.length; rows++) {
            System.out.println(rows);


            for( int columns = 0; columns < new2dArray.length-1; columns++){

                number = 2*N+columns-rows;

                new2dArray[rows][columns] = number;
                System.out.print(new2dArray[rows][columns]);
            }

            new2dArray[rows][N]=4*N-rows+1;
            System.out.print(new2dArray[rows][N]);
            }

        }
    }

