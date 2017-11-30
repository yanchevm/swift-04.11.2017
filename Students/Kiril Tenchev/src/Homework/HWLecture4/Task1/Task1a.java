package Homework.HWLecture4.Task1;
import java.util.Scanner;
public class Task1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int[][] mass=new int[size][size];
        int k=1;
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                mass[j][i]=k++;
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
