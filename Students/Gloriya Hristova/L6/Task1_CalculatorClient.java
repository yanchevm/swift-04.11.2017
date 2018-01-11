package objects;

import java.util.Scanner;

class Calculator{
    
    double sum,sub,mul,div,per; //Милен: Има ли причина да не бъдат private ?
    Scanner input = new Scanner(System.in); //Милен: Тук също.
    
    void setCommand(){
        String text="default"; 
        while (!text.equals("END")){ //Милен: Тук можеш да го оптимизираш малко, за да не се налага да правиш проверката 2 пъти
            text = input.nextLine();
            if(text.equals("END")){
                System.exit(0);
            }
            String[] parts = text.trim().split(" ");
            String command = parts[0];
            
            double a = Double.parseDouble(parts[1]);
            double b = Double.parseDouble(parts[2]);
            
            switch(command){
                case "SUM":sum(a,b);
                    break;
                case "SUB":substract(a,b); 
                    break;
                case "MUL":multiply(a,b); 
                    break;
                case "DIV":divide(a,b); 
                    break;
                case "PER":percentage(a,b); 
                    break; 
                default: System.out.println("Unknown command.");
                }
        }  
    }
	//Милен: БРАВО, много добре си го направила!
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
