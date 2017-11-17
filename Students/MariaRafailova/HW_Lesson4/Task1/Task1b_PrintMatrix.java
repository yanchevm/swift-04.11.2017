package Task1;

import java.util.Scanner;

public class Task1b_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dimension of the matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int count = 1;
        for (int c = 0; c < n; c++){
            if(c == 0 || c%2 == 0){
                for (int r = 0; r < n; r++) {
                    arr[r][c] = count;
                    count++;
                }
            } else {
                for (int r = n-1; r >=0; r--) {
                    arr[r][c] = count;
                    count++;
                }
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (c == arr[1].length-1){
                    System.out.printf("%3d%n", arr[r][c]);
                }
                else{
                    System.out.printf("%3d", arr[r][c]);
                }
            }
        }

    }
}
