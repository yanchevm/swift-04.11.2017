import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentences = sc.nextLine();
		
	// Милен: Задачата не е довършена.
	// 1. За край на изречение се счита не само . а и ? и !
        String [] sentencesSplit = sentences.split(".");

	// 2. Трябва да разпечаташ всяко изречение, не само първото :)
        System.out.println(sentencesSplit[0]);



    }
}
