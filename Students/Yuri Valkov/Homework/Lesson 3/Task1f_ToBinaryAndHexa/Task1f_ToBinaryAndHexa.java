package homework.homework2.Task1f_ToBinaryAndHexa;
import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int num = sc.nextInt();
        int num2 = num;
        String tobin = "";
        String tohexa = "";
        while (num != 0) {
            int bin = num % 2;
            tobin = bin + tobin;
            num /= 2;
        }
        System.out.println(tobin);
        while (num2 != 0) {
            int hexa = num2 % 16;
            switch (hexa) {
                case 10:
                    tohexa = "A" + tohexa;
                    break;
                case 11:
                    tohexa = "B" + tohexa;
                    break;
                case 12:
                    tohexa = "C" + tohexa;
                    break;
                case 13:
                    tohexa = "D" + tohexa;
                    break;
                case 14:
                    tohexa = "E" + tohexa;
                    break;
                case 15:
                    tohexa = "F" + tohexa;
                    break;
                default:
                    tohexa = hexa + tohexa;
                    break;
            }
            num2 /= 16;
        }
        System.out.println(tohexa);
    }


    }

