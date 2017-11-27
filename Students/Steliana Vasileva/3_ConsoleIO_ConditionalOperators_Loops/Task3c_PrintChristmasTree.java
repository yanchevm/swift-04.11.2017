import java.util.Scanner;

/**
 * Created by VS000021 on 12/11/2017.
 */
//yet to be resolved

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N-2; i++){
            for (int j = N-2; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= N-i; k++){
                System.out.print("*");
            }
            for (int j = N-2; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
