package task00;

import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int n = sc.nextInt();
        //Милен: БРАВО!
        if (n <= 0) {
            System.err.println("ERROR! You must enter a positive number!");
        }
        else {
            String result = "";
            System.out.print("Please, enter a sequence of numbers: ");
            //Милен: Това не е условието на задачата :)
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();
        
                result += number + "\n";
            }
    
            System.out.println(result);
        }
    }
}
