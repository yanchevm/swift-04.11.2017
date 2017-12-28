import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;

        for(int i = 1; i <= number; i++) {
            if (i == 1 || i == number){
                continue;
            }

        if (number%i == 0){

            isPrime = false;
            System.out.println("false");
            break;
        } else {
            isPrime = true;
            System.out.println("true");
            break; //Милен: Този брейк ще спре целия цикъл. Така още при първото завършване на излезнеш, и няма да можеш да обходиш всички възможни делители.
        }

        }
    }
}
