package homework.homework3;

import java.util.Scanner;

import static homework.homework3.Task0d_Print2dArray.prnt2dArray;

/**
 * Created by Admin on 23.11.2017 г..
 */
public class Task1а_PrintMatrix {
    public static int counter=1;
    public static boolean existsInField(int[][] field, int y, int x)
    {
        if(y >= 0 && y < field.length && x >= 0 && x < field[0].length)
            return true;
        return false;
    }
    public  static void godown(int[][]a,int row,int col){
        while(!existsInField(a,row,col)){
            a[row][col]=counter;
            counter++;
            row++;
            col++;
        }
    }
    public  static void goup(int[][]a,int row,int col){
        while(!existsInField(a,row,col)){
            a[row][col]=counter;
            counter++;
            row--;
            col++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [][] matrix =new int[n][n];

        for(int r = 0; r<matrix.length; r++)
        {
            for(int c = 0; c<matrix[r].length; c++)
            {
                if (r==0)
                    godown(matrix,r,c);
                else
                    goup(matrix,matrix.length-1,c);
            }
        }


        prnt2dArray(matrix);
    }
}
