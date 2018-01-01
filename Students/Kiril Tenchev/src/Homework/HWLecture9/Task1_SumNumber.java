package Homework.HWLecture9;

import sun.invoke.empty.Empty;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Task1_SumNumber {

   // Милен: Тук не си изпълнил правилно условието на задачата. Трябва ако имаш един от двата грешни слуая, да хвърлиш грешка, която да я прихванеш 
   // в извикващия код
   static void twoNumbers(double number1,double number2){
        if (number1==number2){
            System.err.println("The numbers couldn't be equal.");
        }
        else if(number1<0||number2<0){
            System.err.println("Number/s couldn't be < 0.");
        }
        else{
            System.out.println("Sum = "+(number1+number2));
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double num1 ,num2;
        try {
            System.out.print("Enter first number: ");
            num1=sc.nextDouble();
            System.out.print("Enter second number: ");
            num2=sc.nextDouble();
            twoNumbers(num1,num2);
        }
        catch (InputMismatchException e){ // Кога очакваш да получиш такава грешка ? 
            System.err.println("The numbers must be type witch can be represent as double.");
            e.printStackTrace(System.out);
        }



    }
}
