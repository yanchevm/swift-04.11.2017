package Task1;

import java.util.Scanner;

public class Task1c_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dimension of the matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        //NE E RESHENA
//        int num = 1;
//        //	gorna 1/2 chast:
//        for (int count = 0; count < n-1; count++) {
//            for (int r = count, c=0; r>=0; r--,c++) {
//                arr[r][c] = num++;
//            }
//        }
//
//        //	dolna chast:
//        for (int count2 = 0; count2 < arr[0].length-1; count2++) {
//            for (int r = n-1, c=count2+1; c<arr[0].length; r--,c++) {
//                arr[r][c] = num++;
//            }
//        }
//
        //print
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(j == n-1){
//                    System.out.printf("%3d%n",arr[i][j]);
//                }
//                else {
//                    System.out.printf("%3d",arr[i][j]);
//                }
//            }
//        }

    }
}
