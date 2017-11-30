import java.util.Scanner;


public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());



        int Days = Number/86400;
        int Hours = (Number%86400)/3600;
        int Minutes = ((Number%86400)%3600)/60;
        int Seconds = ((Number%86400)/3600)%60;



        System.out.printf("%d" + " " + "Days"+ ","+ "%d"+ " "+ "Hours" + "," + " " + "%d" + " " + "Minutes" + "," + "%d" + " "+ "Seconds", Days, Hours, Minutes, Seconds);

    }
}
