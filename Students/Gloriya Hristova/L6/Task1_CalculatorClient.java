package objects;

import java.util.Scanner;

class Calculator{
    
    double sum,sub,mul,div,per;
    Scanner input = new Scanner(System.in);
    
    void setCommand(){
         String text = input.nextLine();
    String[] parts = text.trim().split(" ");
    String command = parts[0];
        while (!command.equals("END")){
            
             String part1 = parts[1];
             double a = Double.parseDouble(part1);
             String part2 = parts[2];
             double b = Double.parseDouble(part2);
            
            switch(command){
                case "SUM":sum(a,b);
                    text =input.nextLine();
                    parts = text.trim().split(" ");
                    command = parts[0];
                    break;
                case "SUB":substract(a,b); 
                    text =input.nextLine();
                    parts = text.trim().split(" ");
                    command = parts[0];
                    break;
                case "MUL":multiply(a,b); 
                    text =input.nextLine();
                    parts = text.trim().split(" ");
                    command = parts[0];
                    break;
                case "DIV":divide(a,b); 
                    text =input.nextLine();
                    parts = text.trim().split(" ");
                    command = parts[0];
                    break;
                case "PER":percentage(a,b); 
                    text =input.nextLine();
                    parts = text.trim().split(" ");
                    command = parts[0];
                    break; 
                default: System.out.println("Unknown command.");
                }
        }  
    }
    double sum(double a,double b){
        sum = a+b;
        String num = String.format("%.3f", sum);
        System.out.println(num);
        
        
        return sum;
    }
    double substract(double a,double b){
        sub = a-b;
        String num = String.format("%.3f", sub);
        System.out.println(num);
        return sub;
    }
    double multiply(double a,double b){
        mul = a*b;
        String num = String.format("%.3f", mul);
        System.out.println(num);
        return mul;
    }
    double divide(double a,double b){
        div = a/b;
        String num = String.format("%.3f", div);
        System.out.println(num);
        return div;
    }
    double percentage(double a,double b){
        per = (b/100)*a;
        String num = String.format("%.3f", per);
        System.out.println(num);
        return per;
    }
    
}

public class Task1_CalculatorClient {

    
    public static void main(String[] args) {
        
       Calculator object = new Calculator();
       object.setCommand();
    }
    
}
