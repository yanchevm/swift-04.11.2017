import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5_SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        int a = sc.nextInt();

        System.out.println("Enter a value for b: ");
        int b = sc.nextInt();
        int c;

        c = a;
        a = b;
        b = c;

        System.out.printf("This is the new value for a: %d and b: %d", a, b);
    }
}
