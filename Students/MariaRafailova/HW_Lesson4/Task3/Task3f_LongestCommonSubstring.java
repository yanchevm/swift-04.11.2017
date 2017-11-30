package Task3;

import java.util.Scanner;

public class Task3f_LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first text:");
        String str1 = sc.nextLine();

        System.out.println("Please enter the second text:");
        String str2 = sc.nextLine();

        int difference = 0;
        int maxDiff = 0;
        int maxStart = 0;
        int maxEnd = 0;
        /*
        2 plazgacha v str2 => otriazaci ot str2, dali se sadarjat v str 1
        ako da, vzima se tozi s max daljina
        ne izliza otg?
         */
        for (int j = 0; j <str2.length()-2 ; j++) {
            for (int i = j, k = 0; i < str2.length()-1-j; i++,k++) {
                String subStr = str2.substring(j,str2.length()-1-k);
                if(str1.indexOf(subStr)!= -1){
                    int start = j;
                    int end = str2.length()-1-k;
                    difference = end - start;
                    if(difference > maxDiff){
                        maxDiff = difference;
                        maxStart = start;
                        maxEnd = end;
                    }
                }
            }
        }

        for (int i = maxStart; i <= maxEnd; i++) {
            System.out.print(str2.charAt(i));
        }
        System.out.println();
    }
}
