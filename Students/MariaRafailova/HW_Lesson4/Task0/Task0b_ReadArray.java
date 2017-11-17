package Task0;

import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number:  ");
        String num = sc.nextLine();

        System.out.println("Please enter "+num +" numbers, separated by space:");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        int[] intArr = new int[Integer.parseInt(num)];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
            if(i == intArr.length-1){
                System.out.println(intArr[i]);
            }
            else {
                System.out.print(intArr[i] + ", ");
            }
        }


    }
}
