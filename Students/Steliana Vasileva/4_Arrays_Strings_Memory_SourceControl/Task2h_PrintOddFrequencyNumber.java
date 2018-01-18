package src;
import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        int oddFreqNum = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int k = 0; k < array.length; k++) {

            for (int p = 0; p < array.length - 1; p++) {
                if (array[k] == array[p + 1]) {
                    counter++;
                }
            }
            if (counter % 2 == 0) {
                oddFreqNum=array[k];
                break;

            }
        }
        System.out.println(oddFreqNum);
    }
}
