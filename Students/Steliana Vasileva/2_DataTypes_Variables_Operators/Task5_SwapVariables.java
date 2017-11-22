import java.util.Scanner;


public class Task5_SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int firstVariable = Integer.parseInt(scanner.nextLine());
        //int secondVariable = Integer.parseInt(scanner.nextLine());

        //System.out.print(secondVariable); // Милен: Това е измама :) Решението не се приема!
        //System.out.print(" " + firstVariable);

	// Милен: Помисли за репение с помощта на трета променлива

        int firstVariable = scanner.nextInt();
        int secondVariable = scanner.nextInt();

        int swappedVariable = secondVariable;
        secondVariable = firstVariable;

        System.out.print(swappedVariable);
        System.out.printf(" " +  secondVariable);

    }
}
