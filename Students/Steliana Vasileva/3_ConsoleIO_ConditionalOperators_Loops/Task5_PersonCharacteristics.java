import java.time.Year;
import java.util.Scanner;

public class Task5_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPersons = scanner.nextInt();

        for (int i = 0; i < numberOfPersons; i++) {

            String firstName;
            do {
                System.out.println("Please enter your first name");

            } while (!scanner.hasNext());

            firstName = scanner.next();

            String secondName;

            do {
                System.out.println("Please enter your second name");

            } while (!scanner.hasNext());

            secondName = scanner.next();

            int yearOfBirth;

            do {
                System.out.println("Please enter your year of birth");

            } while (!scanner.hasNextInt() && scanner.nextInt() < 0);

            yearOfBirth = scanner.nextInt();

            double weight;

            do {
                System.out.println("Please enter your weight");
            } while (!scanner.hasNextDouble() && scanner.nextDouble() < 0);


            weight = scanner.nextDouble();

            int height;

            do {
                System.out.println("Please enter your height");

            } while (!scanner.hasNextInt() && scanner.nextInt() < 0);

            height = scanner.nextInt();

            String profession;

            do {
                System.out.println("Please enter your profession");

            } while (!scanner.hasNext());


            profession = scanner.next();

            int age = Year.now().getValue() - yearOfBirth;

            System.out.println();
            if (age < 18) {
                System.out.printf("%s" + " " + "%s" + " is " + "%d" + " years old. His weight is" + " %.1f" + " and he is " + "%d" + " cm tall. He is a " + "%s" + "." + " %s " + "%s " + "is under-aged.%n", firstName, secondName, age, weight, height, profession, firstName, secondName);
            } else {
                System.out.printf("%s" + " " + "%s" + " is " + "%d" + " years old. His weight is" + " %.1f" + " and he is " + "%d" + " cm tall. He is a " + "%s" + ".%n", firstName, secondName, age, weight, height, profession);
            }
        }

        }
    }

