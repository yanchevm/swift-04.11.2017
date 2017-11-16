package mypack;
import java.util.Scanner;

public class Task7_PersonCharacteristics {
    
    public static void main(String[] args){
        
        String name, surname, prof;
        int year;
        int today = 2017;
        float weight,height;
        Scanner input = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        System.out.print("Name: ");
        name = txt.nextLine();
        System.out.print("Surname: ");
        surname = txt.nextLine();
        System.out.print("Year of birth: ");
        year = input.nextInt();
        System.out.print("Weight: ");
        weight = input.nextFloat();
        System.out.print("Height: ");
        height = input.nextFloat();
        System.out.print("Profession: ");
        prof = txt.nextLine();
        
        System.out.println(
               "\n"+name+" "+surname+" is "+(today-year)+" years old. His weight is "+weight+" and he is "+height+" cm tall. He is a "+ prof+".");
    }
    
}
