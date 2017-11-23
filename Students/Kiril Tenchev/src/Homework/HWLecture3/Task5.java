package Homework.HWLecture3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int pers=in.nextInt();
        String name[]=new String[pers];
        String lastName[]=new String[pers];
        int year[]=new int[pers];
        float weight[]=new float[pers];
        float height[]=new float[pers];
        String profession[]=new String[pers];
        int yearsOld[] = new int [pers];
        for (int i = 0; i <pers ; i++) {
            System.out.print("Enter name: ");
            name[i] = in.next();
            System.out.print("Enter last name: ");
            lastName [i]= in.next();
            System.out.print("Enter birth year: ");
            year[i] = in.nextInt();
            System.out.print("Enter weight: ");
            weight[i] = in.nextFloat();
            System.out.print("Enter height in cm: ");
            height[i] = in.nextFloat();
            System.out.print("Profession: ");
            profession[i] = in.next();
            yearsOld[i] = 2017 - year[i];
            if(yearsOld[i]<=0||weight[i]<=0||height[i]<=0){
                System.out.println("Enter person information again.");
                i--;
            }
        }
        for (int i = 0; i <pers ; i++){
            //Милен: Пробвай да го направиш с printf
            if(yearsOld[i]<18) {
                System.out.println(name[i] + " " + lastName[i] + " is " + yearsOld[i] + " years old." + "His/Her weight is " + weight[i]
                        + " kg and he/she is " + height[i] + " cm tall." + "He/She is a " + profession[i] + "." + name[i] + " " + lastName[i] + " is under-aged");
            }
            else {
                System.out.println(name[i] + " " + lastName[i] + " is " + yearsOld[i] + " years old." + "His/Her weight is " + weight[i]
                        + " kg and he/she is " + height[i] + " cm tall." + "He/She is a " + profession[i]);
            }
        }


    }

}
