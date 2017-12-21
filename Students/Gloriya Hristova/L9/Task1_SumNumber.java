package exceptions_management;

import java.util.Scanner;
  
public class Task1_SumNumber {
    
    static int sum;
    static void sumNumber(int num1,int num2)throws Throwable{
        if ( num1==num2){
            IllegalArgumentException equal = new IllegalArgumentException("Equal numbers.\n"
                    + "The numbers shouldn't be equal.");
            throw equal;
        }
        if ( num1<0 || num2<0 ){
            Throwable negative = new Throwable(
                    "Negative number entered.\n"
                    + "The numbers shouldn't be negative.");
            throw negative;
        }else{
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
