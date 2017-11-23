package Homework.HWLecture3;
import java.util.Scanner;
public class Task4d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();
        str=str.replaceAll("[\\D]+"," ");
        String[] numbers=str.split(" ");
        Integer sum = 0;
        for(int i=0;i<numbers.length;i++){
           if(numbers[i].trim().length()!=0){
               Integer value=Integer.valueOf(numbers[i].trim()); //Милен: Можеш ли да го напишеш без да тряба да тримваш два пъти ?
            sum+=value;
           }
        }

        System.out.println("The sum of numbers is: "+sum);

    }

}
