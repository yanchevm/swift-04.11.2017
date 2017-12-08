package Homework.HWLecture4.Task1;
import java.util.Scanner;
public class Task1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int[][] mass=new int[size][size];
        int k=1;
        //Милен: БРАВО! Подреждай кода!
        for (int i = 0; i <size ; i++) {
            if(i%2==0) {
                for (int j = 0; j <size ; j++) {
                    mass[j][i] = k++;
                }
            }
            else if(i%2==1){
                for (int j = size-1; j >-1; j--) {
                    mass[j][i] = k++;
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
