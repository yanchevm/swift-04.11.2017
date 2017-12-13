package homework.homework3;

import java.util.Random;

/**
 * Created by Admin on 23.11.2017 г..
 */
public class Task0d_Print2dArray {
    public  static  void prnt2dArray(int [][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.printf("%d \t",arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int [][]matrix = new int[4][4];
       int n=1;
        for (int i=0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                matrix[i][j]=n;
                n++;
            }
        }
        prnt2dArray(matrix);



    }
}
