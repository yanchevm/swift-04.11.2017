package Task3b_PrintLetterCount;

import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String str = sc.nextLine().toLowerCase();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] != 0) {
                int count =1;
                for (int j = a + 1; j < arr.length; j++) {
                    if (arr[a] == arr[j]) {
                        arr[j] = 0;
                        count++;
                    }
                }
                System.out.printf("%s(%d)%n", arr[a],count);
            }

        }

    }
}
