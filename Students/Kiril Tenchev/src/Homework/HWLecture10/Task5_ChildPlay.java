package Homework.HWLecture10;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task5_ChildPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of children: ");
        int n = sc.nextInt();
        int counter = 0;
        List<Integer> childPlay = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            childPlay.add(i, sc.nextInt());
        }

        for (int i = n-1; i !=0 ; i--) {
            if (childPlay.get(i)>childPlay.get(i-1)){
                childPlay.remove(i);
                counter++;
            }

        }
     //   System.out.println(childPlay);
        System.out.println(counter);
    }
}