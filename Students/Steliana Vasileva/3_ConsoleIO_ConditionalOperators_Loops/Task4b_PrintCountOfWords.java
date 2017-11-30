import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String [] wordCount = sentence.split(" ");

        int counter = 0;

        for (int i = 0; i < wordCount.length; i++){
            if (wordCount[i].equals(" ")) {
                continue;
            } else
                counter++;
            }
        System.out.println(counter);
        }



    }

