import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int newNumber = Integer.parseInt(sc.nextLine())+1; //Милен: Това не е условието на задачата! Трябва да прочетеш цял ред, въведен от потребителя. Може да бъде изречение :)
        System.out.println(newNumber);

    }
}
