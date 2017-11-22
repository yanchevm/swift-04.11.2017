import java.util.Scanner;

public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int inputTime = sc.nextInt();

        int days = inputTime / 86400;
        int hours = (inputTime % 86400 ) / 3600 ;
        int minutes = ((inputTime % 86400 ) % 3600 ) / 60;
        int seconds = ((inputTime % 86400 ) % 3600 ) % 60;

        System.out.printf("%d days, %d hours, %d minutes, %d seconds", days, hours, minutes, seconds);
    }
}
