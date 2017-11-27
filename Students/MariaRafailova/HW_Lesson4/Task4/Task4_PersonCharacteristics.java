package Task4;

import java.time.Year;
import java.util.Scanner;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("First name:");
            String firstName = sc.next();

            System.out.println("Last name:");
            String lastName = sc.next();

            char gender;
            System.out.println("Please enter a gender m or f:");
            do{
                gender = sc.next().charAt(0);
                if (gender != 'm' && gender != 'f'){
                    System.out.println("Invalid input. Please enter again.");
                }
                else {
                    break;
                }
            }while(sc.hasNext());


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

            int old = Year.now().getValue() - birthYear;

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

            int[] grades = new int[4];
            double sum = 0;
            System.out.println("Please enter 4 grades from 2 to 6: ");
            for (int j = 1; j <= 4; j++) {
                do {
                    System.out.print("Grade " + j + ": ");
                    grades[i] = sc.nextInt();
                    if (grades[i] < 2 || grades[i] > 6) {
                        System.out.println("Invalide grade.Please enter again.");
                    }
                    else {
                        sum += grades[i];
                        break;
                    }
                }while(true);
            }

            double averageGrade = sum/grades.length;

            if(gender == 'f'){
                System.out.printf("%s %s is %d years old. Her weight is %.1fkg and she is %.1fcm tall." +
                                  "She is a %s with an average grade of %.3f.%n",
                                    firstName,lastName,old,kg,height,profession,averageGrade);
            }
            else{
                System.out.printf("%s %s is %d years old. His weight is %.1fkg and he is %.1fcm tall." +
                                    " He is a %s with an average grade of %.3f.%n",
                                    firstName,lastName,old,kg,height,profession,averageGrade);
            }

            if(old < 18){
                System.out.printf("%s %s is under-aged.", firstName, lastName);
            }


        }

    }
}
