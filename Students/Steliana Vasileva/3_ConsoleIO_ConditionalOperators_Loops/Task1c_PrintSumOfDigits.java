import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String number = scanner.nextLine();

        int sum = 0;
        for (int i=0; i < number.length(); i++) {
            int numericValue = (int)(number.charAt(i));
          sum += numericValue;
        }
        System.out.println(sum);
    }
}
