package Task0;

import java.util.Arrays;

public class Task0d_Print2dArray {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = count;
                if (j == arr[1].length-1){
                    System.out.printf("%3d%n", arr[i][j]);
                }
                else{
                    System.out.printf("%3d", arr[i][j]);
                }
                count++;
            }
        }

    }
}
