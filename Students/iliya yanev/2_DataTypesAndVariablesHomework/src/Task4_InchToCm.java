import java.util.Scanner;

public class Task4_InchToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in inches: ");
        double input = sc.nextDouble();

        System.out.printf("Value in cm: %.2f", input * 2.54);
    }
}
