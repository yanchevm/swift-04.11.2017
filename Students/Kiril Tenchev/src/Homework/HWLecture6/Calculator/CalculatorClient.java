package Homework.HWLecture6.Calculator;
import java.util.Scanner;
public class CalculatorClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter operation and 2 numbers: ");
        String str = sc.nextLine();
        while (!str.equals("END")) {

            String[] arr =  str.split(" ");
            double a = Double.parseDouble(arr[1]);
            double b = Double.parseDouble(arr[2]);
            if (arr[0].equals("SUB")||arr[0].equals("SUM") || arr[0].equals("DIV") || arr[0].equals("PER") || arr[0].equals("MUL")) {
                switch (arr[0]) {
                    case "SUM":
                        System.out.printf("%.3f%n", calculator.sum(a, b));
                        break;
                    case "SUB":
                        System.out.printf("%.3f%n", calculator.subtract(a, b));
                        break;
                    case "MUL":
                        System.out.printf("%.3f%n", calculator.myltiply(a, b));
                        break;
                    case "DIV":
                        System.out.printf("%.3f%n", calculator.divide(a, b));
                        break;
                    case "PER":
                        System.out.printf("%.3f%n", calculator.percentage(a, b));
                        break;
                }
                System.out.println("Enter operation: ");
                str = sc.nextLine();
            }
            else{

                System.out.println("Enter operation: ");
                System.err.println("Wrong command.");
                str = sc.nextLine();

            }


        }

    }
}


