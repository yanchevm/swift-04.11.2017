package mypack;

import java.util.Scanner;

public class Task0c_ReadAge{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
         int nmb;
         String answer;
       
        System.out.println("Enter number: ");
        nmb = input.nextInt();
        System.out.println("Does the number refer to someone's age? ");
        answer = text.nextLine();
        
        switch(answer){
            case "Yes":
            case "y":
                case "yes":
                case "YES": if(nmb>=18){
                    System.out.println("Adult.");
                }else{
                    System.out.println("Underaged.");
                }break;
                case "No":
            case "n":
                case "no":
                case "NO": System.out.println("The number doesn't refer to anyone's age.");
        }
    }
}
