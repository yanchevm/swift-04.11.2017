package Homework.HWLecture3;
import java.util.Scanner;
public class Task0e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
