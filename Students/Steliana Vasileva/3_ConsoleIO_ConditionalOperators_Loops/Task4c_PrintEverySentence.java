import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentences = sc.nextLine();

        String [] sentencesSplit = sentences.split(".");

        System.out.println(sentencesSplit[0]);



    }
}
