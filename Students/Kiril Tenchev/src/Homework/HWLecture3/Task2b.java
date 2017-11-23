package Homework.HWLecture3;
import java.util.Scanner;
public class Task2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want: ");
        int size=Integer.parseInt(sc.nextLine()); //Милен: Защо четеш стринг, като веднага след това го обръщаш в число ?
        String str=sc.nextLine();
        String []nums=str.split(" ");
        if(nums.length!=size){
            System.out.println("Illegal number of elements");
        }
        else{
            for (int i = nums.length-1; i >=0 ; i--) { //Милен: БРАВО!
                System.out.print(nums[i] + " ");
            }
        }

    }
}
