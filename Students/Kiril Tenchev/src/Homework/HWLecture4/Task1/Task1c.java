package Homework.HWLecture4.Task1;
import java.util.Scanner;
public class Task1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int[][] mass=new int[size][size];
        int p=1;

        //Милен: Добре си го направил. Като резултат не се получава точно това което се иска,
        // но е добре!
        for( int k = 0 ; k < size * 2 ; k++ ) {
            for( int j = 0 ; j <=k ; j++ ) {
                int i = k - j;
                if( i < size && j < size ) {
                    mass[j][i]=p++;
                }
            }

        }
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print(mass[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
