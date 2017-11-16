package mypack;

import java.util.Scanner;


public class Task2_LeapYear {
    
    public static void main(String [] args){
        // Милен: Използваш системния вход за четене на стойност - БРАВО!
        Scanner input = new Scanner(System.in);
        int year;
        boolean type;
        System.out.println("Enter year: ");
        year = input.nextInt();

	// Милен: Алгоритъма е правилен. Има ли как да го оптимизираш като използваш логическите 		оператори ?
	// Какво ще се случи ако потребителя въведе невалидна година - например -40 или 0 ?
        if (year%4!=0){
            type = false;
            System.out.println(type);
        } 
        if(year%4==0){
            if(year%100!=0){
            type = true;
            System.out.println(type);
            
        }
        if(year%400==0){
            type = true;
            System.out.println(type);
        }
        if(year%100==0&&year%400!=0){
            type = false;
            System.out.println(type);
        }
    }
    } 
}


test content
