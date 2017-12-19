package homework.homework3;
import java.util.Scanner;

import static homework.homework3.Task0d_Print2dArray.prnt2dArray;

/**
 * Created by Admin on 24.11.2017 г..
 */
public class Тask1b_PrintMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int n = 1;
        int[][] map = new int [n1][n1];
        for (int row = 0; row < map.length; row++) {

            for (int col = map[row].length - 1; col <map[row].length; col--) {

                if(col>=0)
                    map[row][col] = n;
                n++;
            }
        }





        prnt2dArray(map);
    }
}
