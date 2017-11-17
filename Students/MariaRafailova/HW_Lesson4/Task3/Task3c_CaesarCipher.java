package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter some text: ");
        String str = sc.nextLine();

        System.out.println("encode or decode?");
        String enDec = sc.nextLine();

        char[] arr = str.toCharArray();
        if(enDec.equals("encode")){
            for (int i = 0; i < str.length(); i++) {
                if((str.charAt(i)>='a' && str.charAt(i)<'z') || (str.charAt(i)>='A' && str.charAt(i)<'Z')){
                    int num = (int)str.charAt(i)+1;
                    arr[i]= (char)num;
                }
                if(str.charAt(i) == 'z'){
                    arr[i] = 'a';
                }
                if(str.charAt(i) == 'Z'){
                    arr[i] = 'A';
                }
            }
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                if((str.charAt(i)>'a' && str.charAt(i)<='z') || (str.charAt(i)>'A' && str.charAt(i)<='Z')){
                    int num = (int)str.charAt(i)-1;
                    arr[i]= (char)num;
                }
                if(str.charAt(i) == 'a'){
                    arr[i] = 'z';
                }
                if(str.charAt(i) == 'A'){
                    arr[i] = 'Z';
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
