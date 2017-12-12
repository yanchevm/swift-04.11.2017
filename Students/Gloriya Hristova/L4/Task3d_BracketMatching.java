package matrix;

import java.util.Scanner;

public class Task3d_BracketMatching {
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String text;
        boolean flag=true;
        boolean block=true, op=true, ind=true;
        int countB=0,countOp=0,countI=0,countIndex=0,countOper=0,countBl=0;
        do{
            text = input.nextLine();
            for(int i = 0; i<text.length();i++){
                switch(text.charAt(i)){
                    case'{':countB++;block = false;flag =true;break;
                    case'(':countOp++;op = false;flag = true;break;
                    case'[':countI++;ind = false; flag=true;break;
                    case']':countIndex++;ind = true;flag =true;break;
                    case')':countOper++;op = true;flag=true;break;
                    case'}':countBl++;block = true;flag=true;break;
                    default: flag = false;break;
                }   
                if(flag ==false){System.out.println("Illegal input! Enter only brackets.");
                break;
                }
            }
        }while(flag == false); 
        
        if(countB==countBl&&countOp==countOper&&countI==countIndex){
            if(block==true&&op==true&&ind==true){
                System.out.println(true);
            }
            else{
                System.out.print(false);
            }
        }
        else{
            System.out.print(false);
        }
    } 
}
