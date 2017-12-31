package matrix;

import java.util.Scanner;

public class Task1c_PrintMatrix {
    
    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter number of square matrix rows and columns: ");
            N = input.nextInt();
        }while(N<=0);
        int array[][] = new int[N][N];
        int i = 1;
        int j = 1;
        for (int a = 1; a <= N * N; a++){
            array[i - 1][j - 1] = a;
            if ((i + j) % 2 == 0){
                if (j < N){
                    j++;
                }
                else{
                    i+= 2;
                }
                if (i > 1){
                    i--;
                }
            }
            else{
                if (i < N){
                    i++;
                }
                else{
                    j+= 2;
                }
                if (j > 1){
                    j--;
                }
            }
        }
        for (int[] row : array) {
            for (int a : row) {
                System.out.print(a+"\t");
            }
            System.out.println();
        }
    }
}