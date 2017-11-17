package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = sc.nextLine().toLowerCase();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
               int count =1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 0;
                        count++;
                    }
                }
                System.out.printf("%s(%d)%n", arr[i],count);
            }

        }

    }
}
