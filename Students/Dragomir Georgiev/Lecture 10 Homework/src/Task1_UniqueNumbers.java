import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter how many numbers you want to enter: ");
        int n = sc.nextInt();

        Integer[] list = new Integer[n];

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }

        Set<Integer> sortedSet = new TreeSet<>(Arrays.asList(list));
        printSet(sortedSet);
    }

    private static void printSet(Set<Integer> set){
        for (Integer i : set){
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
