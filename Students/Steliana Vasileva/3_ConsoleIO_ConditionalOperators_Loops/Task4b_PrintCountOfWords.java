import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String [] wordCount = sentence.split(" ");

        int counter = 0;

        for (int i = 0; i < wordCount.length; i++){
            if (wordCount[i].equals(" ")) { //Милен: Алгоритъма не е правилен. Тук проверяваш само за празен символ, но 
					    // такъв няма да има защото преди това си сплитнала по празен символ :)
					    // Освен това, ако в думата има цифра, то тя не се счита за дума, а при теб ще бъде зачетена.
                continue;
            } else
                counter++;
            }
        System.out.println(counter);
        }



    }

