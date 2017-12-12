package matrix;

import java.time.Year;
import java.util.Scanner;


public class Task4_PersonCharacteristics {

   
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        String name, surname, prof;
        int year;
        char gender;
        double average;
       
        
        double [] grades;
        grades = new double[4];
        String[] gr;
        gr = new String [4];
        
        int today = Year.now().getValue();
    
        double weight;
        int height;
        int NPeople;
        String gnd;
        String _year;
        String _weight;
        String _height;
        
        System.out.println("How many people's personal characteristics would you like to add?");
        NPeople = txt.nextInt();
        for(int i=0; i<NPeople;i++){        
        //System.out.print("Name: ");
        String text = input.nextLine();
        String[] wordArray = text.trim().split(";");
        
         name = wordArray[0];
         surname = wordArray[1];
       
         gnd=wordArray[2];
         _year=wordArray[3];
        
         _weight= wordArray[4];
         _height= wordArray[5];
         
         prof = wordArray[6];
         
         gr[0]= wordArray[7];
         gr[1]= wordArray[8];
         gr[2]= wordArray[9];
         gr[3]= wordArray[10];
          
        
                                                
         gender = gnd.charAt(0);
         year = Integer.parseInt(_year);
         
         weight = Double.parseDouble(_weight);
         height = Integer.parseInt(_height);
         double sum=0;
         
            for(int k = 0;k<4; k++){
                grades[k] = Double.parseDouble(gr[k]);
                sum+=grades[k];
            }
         
         average =sum/4;
        
        String w = String.format("%.1f", weight);//native izpolzvane na vunshna biblioteka za java
        String avg= String.format("%.3f", average);
        int age = today - year;
        
        if(gender=='M'){
            
            System.out.print(
               "\n"+name+" "+surname+" is "+age+" years old. His weight is "+w+
                       " and he is "+height+" cm tall. He is a "+ prof+" with an average grade of "+avg+". ");
            if(age<18){
                System.out.print(name+" "+surname+" is underaged.");
            }
        }
        else{System.out.print(
               "\n"+name+" "+surname+" is "+age+" years old.  Her weight is "+w+
                       " and she is "+height+" cm tall. She is a "+ prof+" with an average grade of "+avg+". ");
        if(age<18){
        System.out.print(name+" "+surname+" is underaged.");
        }
        }
        System.out.println();
        }
    }  
}
