package Homework.HWLecture10;

import java.util.*;

public class Task2_CommonSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> sub = new ArrayList<>();
        System.out.print("How many elements would you like to enter in first set: ");
        int size = sc.nextInt();
        System.out.print("How many elements would you like to enter in second set: ");
        int size2 = sc.nextInt();
        int array [] = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter number: ");
            array[i]=sc.nextInt();
        }
        int array2 [] = new int [size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Please enter number: ");
            array2[i]=sc.nextInt();
        }
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size2 ; j++) {

                if(array[i]==array2[j]){
                    sub.add(array[i]);
                }
                else if (array2[j]==array[i]){
                    sub.add(array2[j]);
                }

            }

        }
        if(sub.isEmpty()){
            System.out.println("NO");
        }
        else {
            System.out.println(sub);
        }
    }
}
