package Homework.HWLecture3;
import java.util.Scanner;
public class Task0d {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        System.out.println("Enter number separeted ba space: ");
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }
}
