package src;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int rightSum=0;
        int leftSum=0;
        int index=0;
        int [] newIntArray = new int[N];

        for (int i =0; i < newIntArray.length; i++) {
            newIntArray[i] = sc.nextInt();
        }
        for(int i=0; i < newIntArray.length; i++) {

            rightSum += newIntArray[i];
            leftSum += newIntArray[newIntArray.length - 1 - i];

            if ((rightSum == leftSum)) {
                index = i;


            }
        }
            System.out.println(index);
            if (index == 0){
                System.out.println("NO");
            }
            }

        }


