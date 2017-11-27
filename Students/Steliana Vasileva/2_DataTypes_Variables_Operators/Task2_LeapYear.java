import java.util.Scanner;


public class Task2_LeapYear {
    public static void main(String[] args) {
	// Милен: Използваш системния вход - БРАВО!
        Scanner scanner = new Scanner(System.in);
        //int Year = Integer.parseInt(scanner.nextLine()); // Милен: Разгледай scanner за методите които предлага. Може да намериш нещо по-подходящо

        int Year = scanner.nextInt();
   //if (Year % 100 == 0 && Year % 400 == 0){ // Милен: Добра практика е да заграждаш със скоби булевите уравнения -  Year % 100 == 0 && Year % 400 == 0 -> (Year % 100 == 0) && (Year % 400 == 0)
        if ((Year % 100 == 0) && (Year % 400 == 0)){
        System.out.println("True");

    } else if (Year % 100 != 0 && Year % 4 == 0) { 
        System.out.println("True");

    } else {
        System.out.println("false");
    }

    }
}



