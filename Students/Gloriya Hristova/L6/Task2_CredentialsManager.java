package objects;

import java.util.Scanner;

class Credentials{
 
    Scanner input = new Scanner(System.in);
    String text,username, password, isPass,newPass,command;
    
    
    void setCommand()throws ArrayIndexOutOfBoundsException{
        while(!command.equals("END")){
            text = input.nextLine();
            if(text.equals("END")){
                 System.exit(0);
            }
            String [] parts;
            parts = text.trim().split(" ");
            command = parts[0];
            username = parts[1];
            
            switch(command){
                case "ENROLL":
                    password = parts[2];
                    if(!username.equals("")&&!password.equals("")){
                        System.out.println("ENROLL success"); 
                    }
                    else{
                        System.out.println("ENROLL fail.");
                    }
                    break;
                case "AUTH":
                    isPass=parts[2];
                    if(isPass.equals(password)){
                        System.out.println("AUTH success.");
                    }
                    else{
                        System.out.println("AUTH fail.");
                    }
                    break;
                case "CHPASS":
                    isPass=parts[2];
                    newPass=parts[3];
                    if(isPass.equals(password)){
                        password=newPass;
                        System.out.println("CHPASS success.");
                    }
                    else{
                        System.out.println("CHPASS fail."); 
                    }
                    break;
                default:System.out.println("Invalid command.");
            }  
        }
    }
}   

public class Task2_CredentialsManager{
    
   public static void main(String [] args){
       Credentials user1 = new Credentials();
       Credentials user2 = new Credentials();
       try{
           user1.setCommand();
           user2.setCommand();
       }
       catch(ArrayIndexOutOfBoundsException e){
           if(user2.command.equals("")){
               System.out.println(user1.command+" fail.");
           }
           else{
               System.out.println((user2.command+" fail."));
           }
       }
   }
}
