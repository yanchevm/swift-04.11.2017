package Homework.HWLecture4.Task3;

import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean symmetric  = true;
        for (int i = 0; i <((str.length())+1)/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                symmetric = false;
            }
        }
        System.out.println(symmetric);
    }
}
