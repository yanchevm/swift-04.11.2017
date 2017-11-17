import java.util.Scanner;

public class Task4d_SumOfNumbersInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        int number = 0;
        String [] sentenceSplit = sentence.split(" ");

        for (int i = 0; i < sentenceSplit.length; i++){
            if (sentenceSplit[i].matches("[0-9]+")){
                number += Integer.parseInt(sentenceSplit[i]);
                } else {
                continue;

            }
        }
        System.out.println(number);

    }
}
