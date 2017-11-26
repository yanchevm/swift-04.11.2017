package Task1_CalculatorClient;

import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Please write a type of calculation and two numbers, separated by space: ");
        String input = sc.nextLine();

        while (!input.equals("END")){
            String[] arr = input.split(" ");
            //String cal = arr[0];
            double a = Double.parseDouble(arr[1]);
            double b = Double.parseDouble(arr[2]);
            if(arr.length == 3){
                switch (arr[0]){
                    case "sum":
                        System.out.printf("%.3f%n",calculator.sum(a,b)); break;
                    case "sub":
                        System.out.printf("%.3f%n",calculator.subtract(a,b)); break;
                    case "mul":
                        System.out.printf("%.3f%n",calculator.multiply(a,b));break;
                    case "div":
                        System.out.printf("%.3f%n",calculator.divide(a,b));break;
                    case "per":
                        System.out.printf("%.3f%n",calculator.percentage(a,b));break;
                }
            }
            System.out.println("Please write a type of calculation and two numbers, separated by space: ");
            input = sc.nextLine();
        }
    }
}
