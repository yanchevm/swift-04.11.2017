

import java.util.Scanner;

public class Task0_NumberNotANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");

        do{
            String num = sc.next();
            try{
                Integer.parseInt(num);
                System.out.println("ok");
                break;
            }catch(NumberFormatException e){
                System.out.println("Please try again.");
            }

        }while (true);


    }

}
