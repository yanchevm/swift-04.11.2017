package src;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int counter = 0;
        int [] numbers = new int[N];

        for (int i =0; i < numbers.length-1; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i: numbers
             ) {
            if(i==1 || i==0){
                continue;
            }
            if (numbers[i]==numbers[i-1] && numbers[i]!=numbers[i-2]){
                counter++;
            }

        }
        System.out.println(counter);
    }
}
