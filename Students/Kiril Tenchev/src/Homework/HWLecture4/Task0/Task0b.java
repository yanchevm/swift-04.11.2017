package Homework.HWLecture4.Task0;
import java.util.Scanner;
public class Task0b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        sc.nextLine();
        int arr[]=new int [size];
        //Милен: Браво, добро решение!
        Scanner numSC=new Scanner(sc.nextLine());
        for (int i = 0; i <size ; i++) {
            if(numSC.hasNextInt()){
                arr[i]=numSC.nextInt();
            }
            else{
                System.out.println("You didn't enter enough numbers: ");
                break;
            }

        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+",");

        }
    }
}
