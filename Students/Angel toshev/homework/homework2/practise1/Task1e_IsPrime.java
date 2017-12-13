package homework.homework2.practise1;

import java.util.Scanner;

/**
 * Created by Admin on 11.11.2017 г..
 */
public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = sc.nextInt();
        System.out.println(isPrime(num));

    }
    private  static  boolean isPrime(int number){
      double a = Math.sqrt(number) ;
      if (number<2)
          return  false;
          for (int i = 2; i <= a; i++) {
              if (number % i == 0)
                  return false;
          }

      return  true;
    }
}
