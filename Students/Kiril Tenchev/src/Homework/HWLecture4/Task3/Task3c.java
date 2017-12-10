package Homework.HWLecture4.Task3;
import java.util.Scanner;
public class Task3c {
    public static void main(String[] args) {
        int value;
        int newStr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        System.out.print("What do you want to do encode/decode: ");
        String chose = sc.nextLine();
        char [] arr = new char[str.length()];
        //Милен: Избягвай правенето на толкова големи if-else стейтмънти.
        // Може да го разделиш на два метода.
        if (chose.equals("encode")){
            for (int i = 0; i <str.length() ; i++) {
                if((str.charAt(i)>='a'||str.charAt(i)<='z'||str.charAt(i)>='A'||str.charAt(i)<='Z')){
                    if(str.charAt(i)!=' ') {
                        if (str.charAt(i)=='z'||str.charAt(i)=='Z') {
                            switch (str.charAt(i)) {
                                case 'z':
                                    arr[i] = 'a';
                                    break;
                                case 'Z':
                                    arr[i] = 'A';
                                    break;
                            }
                            System.out.print(arr[i]);
                        }
                        else {
                            value = (int) str.charAt(i);
                            newStr = value + 1;
                            arr[i] = (char) newStr;
                            System.out.print(arr[i]);
                        }
                    }
                    else if(str.charAt(i)==' '){
                        arr[i]=' ';
                        System.out.print(arr[i]);
                    }

                }
            }
        }
        else if (chose.equals("decode")){
            for (int i = 0; i <str.length() ; i++) {
                if((str.charAt(i)>='a'||str.charAt(i)<='z'||str.charAt(i)>='A'||str.charAt(i)<='Z')){
                    if(str.charAt(i)!=' ') {
                        if (str.charAt(i)=='z'||str.charAt(i)=='Z') {
                            switch (str.charAt(i)) {
                                case 'a':
                                    arr[i] = 'z';
                                    break;
                                case 'A':
                                    arr[i] = 'Z';
                                    break;
                            }
                            System.out.print(arr[i]);
                        }
                        else {
                            value = (int) str.charAt(i);
                            newStr = value - 1;
                            arr[i] = (char) newStr;
                            System.out.print(arr[i]);
                        }
                    }
                    else if(str.charAt(i)==' '){
                        arr[i]=' ';
                        System.out.print(arr[i]);
                    }

                }
            }


        }
    }
}

