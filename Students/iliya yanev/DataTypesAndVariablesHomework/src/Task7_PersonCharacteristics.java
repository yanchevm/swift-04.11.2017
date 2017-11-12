import java.time.Year;
import java.util.Scanner;

public class Task7_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = sc.next();

        System.out.print("Last name: ");
        String lastName = sc.next();

        System.out.print("Date of birth: ");
        int dob = sc.nextInt();

        System.out.print("Weight: ");
        double weight = sc.nextDouble();

        System.out.print("Height: ");
        int heigth = sc.nextInt();

        System.out.print("Profession: ");
        String profession = sc.next();

        int age = Year.now().getValue() - dob;
        System.out.printf("%s %s is %d years old. His weight is %.2f and he is %d cm tall. He is a %s.", firstName, lastName, age, weight, heigth, profession);
    }
}
