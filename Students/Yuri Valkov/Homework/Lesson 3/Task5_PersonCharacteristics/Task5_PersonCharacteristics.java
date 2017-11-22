package Lesson3.Homework.Task5_PersonCharacteristics;
import java.util.Scanner;
import java.time.Year;

public class Task5_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("First name:");
            String firstName = sc.next();

            System.out.println("Last name:");
            String lastName = sc.next();

            int birthYear = 0;
            System.out.println("Year of birth:");
            do{
                birthYear = sc.nextInt();
                if(birthYear <(Year.now().getValue()-120) || birthYear > Year.now().getValue()){
                    System.out.println("Invalid year. Please try again.");
                }
                else {
                    break;
                }
            }while (sc.hasNext());

            double kg = 0;
            System.out.println("Kg:");
            do{
                kg = sc.nextDouble();
                if(kg <0 || kg > 400){
                    System.out.println("Invalid kg. Please try again.");
                }
                else {
                    break;
                }
            }while (sc.hasNext());

            double height = 0;
            System.out.println("Height / sm:");
            do{
                height = sc.nextDouble();
                if(height <0 || height > 300){
                    System.out.println("Invalid height. Please try again.");
                }
                else {
                    break;
                }
            }while (sc.hasNext());

            System.out.println("Profession:");
            String profession = sc.next();

            int old = Year.now().getValue() - birthYear;

            System.out.println(firstName+" "+ lastName+" is " +old +" years old. His/her weight is " +kg+" and he/she is "+
                    height + " cm tall. He/she is a "+ profession);

            if(old < 18){
                System.out.printf("%s %s is underage.", firstName, lastName);
            }


        }



    }
}
