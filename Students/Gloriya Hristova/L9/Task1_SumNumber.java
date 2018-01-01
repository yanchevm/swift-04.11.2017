package exceptions_management;

import java.util.Scanner;
  
public class Task1_SumNumber {
    
    static int sum;
    static void sumNumber(int num1,int num2)throws Throwable{ // Не е добра практика да хвърляш Throwable. Използвай Exception.
								// Throwable включва в себе си и Error а той не бива да бъде прихващан. 
        if ( num1==num2){
            IllegalArgumentException equal = new IllegalArgumentException("Equal numbers.\n"
                    + "The numbers shouldn't be equal.");
            throw equal;
	// Това се записва по следния начина:
	// throw new IllegalArgumentException("Equal numbers.\n "The numbers shouldn't be equal.");

        }
        if ( num1<0 || num2<0 ){
            Throwable negative = new Throwable(
                    "Negative number entered.\n"
                    + "The numbers shouldn't be negative.");
            throw negative;
	// Тук ако искаш да хвърлиш друга грешка, защо не си направиш една ? Ще е доста по-подходящо от Throwable. Също е възможно да ползваш Exception.
        }else{ // Нямаш нужда от else тук. Реално, единствено при различни неотрицателни числа ще достигнеш до тук.
            if(num1!=num2){
               sum= num1+num2;
               System.out.println("Sum of the numbers entered:"+sum);
            }
        }
    }
        
    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter first number:");
        number1=input.nextInt();
        System.out.println("Enter second number:");
        number2=input.nextInt();
        try{
            sumNumber(number1,number2);
        }
        catch(IllegalArgumentException equal){
            System.out.println(equal);
            
        }
        catch(Throwable negative){
           System.out.println(negative); 
        }
    }
}
