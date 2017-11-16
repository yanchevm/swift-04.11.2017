package Homework.HWLecture3;
import java.util.Scanner;
public class Task4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
       // char [] charArr=str.toCharArray();
        str=str.replaceAll("a","");
        str=str.replaceAll("i","");
        str=str.replaceAll("o","");
        str=str.replaceAll("e","");
        str=str.replaceAll("u","");

        System.out.println(str);
        }
    }

