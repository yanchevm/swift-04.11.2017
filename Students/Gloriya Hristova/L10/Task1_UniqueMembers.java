package data_structures;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class Task1_UniqueMembers {
    
    public static void main(String [] args){
        Set <Integer> sortedSet = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        int N;
        N = input.nextInt();
        Integer[] numbers = new Integer[N];
        for(int i = 0; i < N; i++){
            numbers[i] = input.nextInt();
        }
        sortedSet.addAll(Arrays.asList(numbers));
        printSet(sortedSet);
    }
     private static void printSet(Set<Integer> set) {
        for(Integer i : set) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
