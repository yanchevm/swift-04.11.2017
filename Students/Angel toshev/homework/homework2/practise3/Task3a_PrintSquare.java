package homework.homework2.practise3;

import java.util.Scanner;

/**
 * Created by Admin on 12.11.2017 г..
 */
public class Task3a_PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        for (int a = 0; a < n1; a++)
        {
            if (a == 0 || a == n1 - 1) {
                for(int c = 0; c < n; c++)
                {
                    System.out.print("*");
                }
            }
            if(a!= 0 && a != n1 - 1 )
            {
                for(int b = 0; b < n; b++)
                {
                    if(b == 0 || b == n -1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println();

        }

    }
}
