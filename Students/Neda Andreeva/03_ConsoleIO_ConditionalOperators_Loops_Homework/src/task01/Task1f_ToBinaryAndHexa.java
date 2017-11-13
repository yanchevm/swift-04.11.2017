package task01;

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = sc.nextInt();
        int number2 = number;

        String binResult = "";
        String hexResult = "";

        while (number != 0) {
            int bin = number % 2;
            binResult = bin + binResult;
            number /= 2;
        }

        System.out.println(binResult);

        while (number2 != 0) {
            int hex = number2 % 16;
            switch (hex) {
                case 10: hexResult = "A" + hexResult; break;
                case 11: hexResult = "B" + hexResult; break;
                case 12: hexResult = "C" + hexResult; break;
                case 13: hexResult = "D" + hexResult; break;
                case 14: hexResult = "E" + hexResult; break;
                case 15: hexResult = "F" + hexResult; break;
                default: hexResult = hex + hexResult; break;
            }
            number2 /= 16;
        }

        System.out.println(hexResult);
    }
}
