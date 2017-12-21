import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String Number = scanner.nextLine();

        for (int i = Number.length(); i >= 1; i--) { //Милен: БРАВО, много добре си се досетила!

            System.out.print(Number.charAt(i-1)); //Милен: Щом вадиш едно от i, защо просто не започнеш от Number.lenght() - 1 ? 

        }
    }
}
