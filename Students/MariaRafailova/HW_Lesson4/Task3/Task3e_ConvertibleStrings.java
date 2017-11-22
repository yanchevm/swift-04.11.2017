package Task3;

import java.util.Scanner;

public class Task3e_ConvertibleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first text:");
        String str1 = sc.nextLine();

        System.out.println("Please enter the second text:");
        String str2 = sc.nextLine();

        boolean convertible = false;
        for (int i = 0; i < str2.length()-1; i++) {
            String subStr1 = str2.substring(0,str2.length()-1-i);
            String subStr2 = str2.substring(str2.length()-1-i,str2.length()-1);
            if(str1.indexOf(subStr1)!= -1 && str1.indexOf(subStr2)!= -1){
                convertible = true;
                break;
            }
        }

        System.out.println(convertible ? true : false);
    }
}
