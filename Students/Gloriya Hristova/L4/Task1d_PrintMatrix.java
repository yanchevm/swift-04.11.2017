package matrix;

import java.util.Scanner;

class Task1d_PrintMatrix{
    public static void main(String[] args){
        int a = 1;
        int N;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter number of square matrix rows and columns: ");
            N = input.nextInt();
        }while(N<=0);
        int array[][] = new int[N][N];
        int numConcentricSquares = (int) Math.ceil((N) / 2.0);
        int j;
        int sideLen = N;
        for(int i = 0; i < numConcentricSquares; i++) {
            for(j = 0; j < sideLen; j++) {
                array[i][i + j] = a++;
            }
            for(j = 1; j < sideLen; j++) {
                array[i + j][N - 1 - i] = a++;
            }
            for(j = sideLen - 2; j > -1; j--) {
                array[N - 1 - i][i + j] = a++;
            }
            for(j = sideLen - 2; j > 0; j--) {
                array[i + j][i] = a++;
            }
            sideLen -= 2;
        }
        for(int[] row : array){
            for (int elem : row){
                System.out.printf(elem+"\t");
            }
            System.out.println();
        }
    }
}