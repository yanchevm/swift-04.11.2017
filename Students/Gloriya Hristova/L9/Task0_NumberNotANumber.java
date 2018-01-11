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
                System.exit(0); // Милен: Това не е добра практика! Така спираш виртуалната машина директно. Какво ще стане ако имаш try-finally блок ?
				// Ще се изпълни ли кода в finally блока ?
				// По-добре е да използваш return; 
            }
            
            try{
                number = Integer.parseInt(isNum);
            }
            
            catch(NumberFormatException nNumber){ // Милен: БРАВО!
                System.out.println("Not a number.");
                hasError=true;
            }
            finally{ // Милен: Това можеш да го опитимизираш малко! Защо вместо това, просто не разпечатваш System.out.println("Number."); веднага след "number = Integer.parseInt(isNum);". По този начин, ако имаш грешка, ще се пропусне. Ще си спестиш доста код :)
                if(hasError==false){
                    System.out.println("Number.");
                }
            }
            
        }while(!isNum.equals("END"));
        
    }
}
