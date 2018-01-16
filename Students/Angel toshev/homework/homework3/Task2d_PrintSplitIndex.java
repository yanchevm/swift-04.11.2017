package homework.homework3;

import java.util.Scanner;

/**
 * Created by Admin on 25.11.2017 г..
 */
public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        splitIndex(arr);

    }
    public  static  void splitIndex(int [] arr){
        int allSum = 0;
        int leftSum=0;
        int result=0;
        for(int i = 0;i<arr.length;i++){
            allSum+=arr[i];
        }
	// Милен: БРАВО, алгоритъма е правилен
        for (int i = 0;i<arr.length;i++){
            allSum-=arr[i];
            leftSum+=arr[i];
            if (allSum==leftSum){
                result=i;
                //System.out.println(i);
            }

        }
        System.out.println(result);
    }
}
