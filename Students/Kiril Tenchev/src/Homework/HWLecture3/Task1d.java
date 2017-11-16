package Homework.HWLecture3;
import java.util.Scanner;
public class Task1d {
    static void printDivisors(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.printf("%d ",i);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("The divisors of "+n+" are: ");
        printDivisors(n);
    }
}
