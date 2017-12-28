

import java.util.Scanner;

public class Task1_SumNumber {

    static void myMethod(int num1, int num2) throws Exception {
            if (num1 == num2) {
            throw new Exception("The numbers are equal");
            }
            if( num1<0 || num2<0 ){
                throw new Exception("Positive numbers required");
            }

        System.out.println(num1+num2);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number:");
        int num2 = sc.nextInt();

        try {
            myMethod(num1, num2);
        }
        catch(Exception exc)
        {
            System.out.println("Error: " + exc.getMessage());
        }

    }
}
