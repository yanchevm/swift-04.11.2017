import java.util.Scanner;

public class Task2b_PrintReversedSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] myIntArray = new int[number];

        for (int i = 0; i <= myIntArray[number-1]; i++) { 
	   //Милен: Цикъла не е направен коректно. Започка от 0 (което е добре) но след това продължава до ? Би трябвало да е до myIntArray.lenght -1,
	   // а не до колкото е първия елемент от масива.
            myIntArray [i] = scanner.nextInt();
        }

	//Милен: Пример
	for(int i = 0; i < myIntArray.lenght; i++) {
		//....	
	}

	//Милен: Тук отново...
        for (int j = myIntArray.length; j >= myIntArray[0]; j--) {
            System.out.printf("%d"+ " ", j);
            }
        }

    }

