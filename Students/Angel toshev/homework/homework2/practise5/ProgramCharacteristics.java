package homework.homework2.practise5;

import java.util.Scanner;
import java.time.Year;

/**
 * Created by Admin on 26.11.2017 г..
 */
public class ProgramCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];
        String name;
        String lastName;
        int age;
        double haight;
        String profesion;
        int birthYear;
        double weight;
        for (int i=0;i<n;i++){
            System.out.println("Please enter first name");
             name = sc.next();
            if (name == null)
                System.out.println("Please enter valid name");
            System.out.println("Please enter last name");
             lastName = sc.next();
            if (lastName == null)
                System.out.println("Please enter valid name");

            System.out.println("Please enter birth Year");
             birthYear=0;
             do {
                 birthYear= sc.nextInt();
                 if (birthYear<Year.now().getValue()-150||birthYear>Year.now().getValue()) {
                     System.out.println("Invalid year ,try again");
                 }
             }
             while (sc.hasNext());


                System.out.println("Please enter your weight");
                weight=0.0;
                 do {
                     weight=sc.nextDouble();
                     if (weight<0)
                         System.out.println("Uncorect weight");
                 }while (sc.hasNext());

            System.out.println("Enter your haight");
            haight=0.0;
            do {
                haight=sc.nextDouble();
                if (haight<0)
                    System.out.println("Please enter corect haight");
            }while (sc.hasNext());
            System.out.println("Please enter your profesion");
           do {
               profesion=sc.next();
               if (profesion==null)
                   System.out.println("Please enter corect profesion");
           }while (sc.hasNext());

            System.out.printf("His/her name is %s %s.He/She is %d years old.He/She is born %d.His/her weight is %d.He/she is %d sm tall.He/She is %s. ",name,lastName,birthYear,weight,haight,profesion);
        }

    }
}
