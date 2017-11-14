package task04;

import java.util.Scanner;

/**
 * Created by neda.andreeva on 11/06/2017.
 */
public class Task4_InchToCm {

    //Милен: Как записвахме името на константите ?
    final static float oneInch = 2.54F;
    public static void main(String[] args) {
        //Милен: БРАВО за сканера!
        Scanner scan = new Scanner(System.in);

        float inch = scan.nextFloat();
        float cm = inch * oneInch;

        System.out.println(cm);
    }
}
