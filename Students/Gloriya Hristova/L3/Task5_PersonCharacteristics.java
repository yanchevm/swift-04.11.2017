package mypack;

import java.util.Scanner;
import java.time.Year;

public class Task5_PersonCharacteristics {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        String name, surname, prof;
        int year;
        int today = Year.now().getValue();
    
        double weight;
        int height;
        int NPeople;
        boolean flag=false;
        
        //System.out.println("How many people's personal characteristics would you like to add?");
        NPeople = input.nextInt();
        for(int i=0; i<NPeople;i++){        
        //System.out.print("Name: ");
        do{name = txt.nextLine();}while(name.matches(".*\\d+.*"));
        if(name.endsWith("a")){
            flag = true;
        }
     
        //System.out.print("Surname: ");
        do{surname = txt.nextLine();}while(surname.matches(".*\\d+.*"));
        if(surname.endsWith("a")){
            flag = true;
        }
        
        //System.out.print("Year of birth: ");
        
            year = input.nextInt();
            int age = today - year;
            
        //System.out.print("Weight: ");
        weight = input.nextFloat();
        //System.out.print("Height: ");
        height = input.nextInt();
        
        //System.out.print("Profession: ");
        prof = txt.nextLine();
        System.out.println();
        
        String s = String.format("%.6f", weight);
        
        if(flag == false){
            
            System.out.print(
               "\n"+name+" "+surname+" is "+age+" years old. He was born in "+year+". His weight is "+s+
                       " and he is "+height+" cm tall. He is a "+ prof+". ");
    if(age<18){
        System.out.print("He is underaged.");}
    
        }
        else{System.out.print(
               "\n"+name+" "+surname+" is "+age+" years old. She was born in "+year+". Her weight is "+s+
                       " and she is "+height+" cm tall. She is a "+ prof+". ");
    if(age<18){
        System.out.print("She is underaged.");}
            
        }
        }
        System.out.println();
}
    
}
