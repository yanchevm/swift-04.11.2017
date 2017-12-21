import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine()); //Милен: Тук отново, можеш да ползваш nextInt().

        for (int i = 1; i <= number; i++) {
			//Милен: БРАВО!
            if (number%i == 0){
                System.out.printf(i + " ");
            }
        }
    }
}
