package Homework.HWLecture10;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
public class Task1_UniqueMembers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements would you like to enter: ");
        int size = sc.nextInt();
        Set<Integer> s = new LinkedHashSet<>(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter number: ");
            s.add(sc.nextInt());
        }
        System.out.println(s);
    }
}
