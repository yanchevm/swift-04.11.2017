import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task6_WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text:");
        String text = sc.nextLine().toLowerCase();

        String[] arr = text.split(" ");

        System.out.println("Enter a number N:");
        int num = sc.nextInt();

        System.out.println("Enter two words N times:");
        String[] arr2 = new String[num];
        for (int i = 0; i < num; i++) {
            arr2[i] = sc.nextLine().toLowerCase();
            System.out.println(arr2[i]);
        }

        for (int i = 0; i < arr2.length ; i++) {
            String[] parts = arr2[i].split(" ");

            for (int j = 0; j < arr.length; j++) {
                if(parts[0].equals(arr[j])){
                    arr[j] = parts[1];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
