import java.util.Scanner;

/**
 * Created by VS000021 on 12/11/2017.
 */
public class Task4a_StringWoVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        char [] newCharArray = sentence.toCharArray();

        for (int i =0; i < newCharArray.length; i++) {
		// Милен: Добра идея е да запишеш елемента в една променлива и тогава да ползваш нея направо.
		// Пример: char c = newCharArray[i];
		// След това използваш тази променлива :)
            if (newCharArray[i] != 'a' && newCharArray[i] != 'e' && newCharArray[i] != 'o' && newCharArray[i] != 'u' && newCharArray[i] != 'i'){
                System.out.print(newCharArray[i]);
            } else{
                continue;
            }
        }


    }
}
