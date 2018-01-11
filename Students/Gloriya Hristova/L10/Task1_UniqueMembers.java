package data_structures;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class Task1_UniqueMembers {
    
    public static void main(String [] args){
        Set <Integer> sortedSet = new TreeSet<>(); //Милен: БРАВО! Подходяща структура си избрала. В условието не пише, че трябва да бъдат сортирани, тоест не е нужно да използваш TreeSet а може HashSet. Ако държиш да бъдат потредени, тогава си направила правилния избор.
        Scanner input = new Scanner(System.in);
        int N;
        N = input.nextInt();
        Integer[] numbers = new Integer[N]; //Милен: Масива няма нужда да бъде от рапърите на int. 
        for(int i = 0; i < N; i++){
            numbers[i] = input.nextInt();
        }
        sortedSet.addAll(Arrays.asList(numbers));
        printSet(sortedSet);
    }
     private static void printSet(Set<Integer> set) { //Милен: БРАВО! Много добър подход! Всеки метод тряба да прави точно едно нещо!
        for(Integer i : set) { //Милен: Няма нужда да използваш рапърите на int.
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
