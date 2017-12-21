package exceptions_management;

import java.util.Scanner;

public class Task0_NumberNotANumber {
    
    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);
        String isNum;
        boolean hasError;
        
        int number;
        number = Integer.MIN_VALUE;
        do{
            hasError = false;
            isNum = input.nextLine();
            if(isNum.equals("END")){
                System.exit(0);
            }
            
            try{
                number = Integer.parseInt(isNum);
            }
            
            catch(NumberFormatException nNumber){
                System.out.println("Not a number.");
                hasError=true;
            }
            finally{
                if(hasError==false){
                    System.out.println("Number.");
                }
            }
            
        }while(!isNum.equals("END"));
        
    }
}
