package homework.homework2.practise4;

import java.util.Scanner;

/**
 * Created by Admin on 1.12.2017 г..
 */
public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text!!!");
        String txt = sc.nextLine();
        String arr [] = txt.split(" ");
        int count = arr.length;

        for (int i =0;i<arr.length;i++){
            boolean isNumber=false;

            for (int j = 0;j<arr[i].length();j++){
                switch (arr[i].charAt(j)){
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        isNumber=true;
                        break;
                }
                if (isNumber){
                    count-=1;

                }
            }

        }
        System.out.println(count);
    }
}
