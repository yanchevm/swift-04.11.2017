package Task4;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter some text: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        int count = arr.length;
        for (int i = 0; i < arr.length; i++) { //za vsiaka duma
        boolean hasNum = false;
            for (int j = 0; j < arr[i].length(); j++) { //za vsiaka bukva
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
                        hasNum = true; break;
                }
                if (hasNum){
                    count -= 1;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
