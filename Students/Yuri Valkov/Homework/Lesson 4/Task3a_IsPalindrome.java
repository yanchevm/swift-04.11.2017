package Task3a_IsPalindrome;
import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text: ");
        String str = sc.nextLine();

        boolean palindrom = true;
        //Милен - БРАВО! Много добро решение
        for (int i = 0, k = str.length()-1; i <= str.length()/2; i++, k--) {
            if(str.charAt(i) != str.charAt(k)){
                palindrom = false;
                break;
            }
        }

        System.out.println(palindrom? true: false);
    }
}
