package Task1;

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        int numOrigin = num;// pazim originalnata st-st na chisloto

        int mod;
        String bin = "";
        do{
            mod = num%2;
            bin = mod+bin;
            num /=2;
        }while (num>0);

        int del;
        String hex = "";
        String digits = "0123456789ABCDEF";
        do{
            del = numOrigin%16;
            hex = digits.charAt(del)+hex;
            numOrigin /=16;
        }while (numOrigin>0);


        System.out.println(bin);
        System.out.println(hex);
    }
}
