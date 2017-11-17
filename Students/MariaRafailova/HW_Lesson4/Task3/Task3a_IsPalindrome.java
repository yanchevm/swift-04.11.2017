package Task3;

import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = sc.nextLine();

        boolean palindrom = true;
        for (int i = 0, j = str.length()-1; i <= str.length()/2; i++, j--) {
            if(str.charAt(i) != str.charAt(j)){
                palindrom = false;
                break;
            }
        }

        System.out.println(palindrom? true: false);
    }
}
