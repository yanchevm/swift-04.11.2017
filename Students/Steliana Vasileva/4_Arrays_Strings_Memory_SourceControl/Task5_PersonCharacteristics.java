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

            char gender;

            do {
                System.out.println("Please enter your gender.");
            } while (!scanner.hasNext());

            gender = scanner.next().charAt(0);

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

            double[] grades = new double[4];
            System.out.println("Please enter four of your grades.");

            for (int j = 0; j < grades.length; j++) {

                grades[j] = scanner.nextDouble();
            }
            double averageGrades = (grades[0] + grades[1] + grades[2] + grades[3]) / 2;

            System.out.println();

            if (gender == 'M' || gender == 'm') {
                if (age < 18) {
                    System.out.printf("%s %s is %d years old. His weight is %.1f and he is %dcm tall. He is a %s with an average grade of %.3f. %s %s is under-aged.%n", firstName, secondName, age, weight, height, profession, averageGrades, firstName, secondName);
                } else {
                    System.out.printf("%s %s is %d years old. His weight is %.1f and he is %dcm tall. He is a %s with an average grade of %.3f.", firstName, secondName, age, weight, height, profession, averageGrades);
                }
            } else if (gender == 'F' || gender == 'f') {
                if (age < 18) {
                    System.out.printf("%s %s is %d years old. Her weight is %.1f and she is %dcm tall. She is a %s with an average grade of %.3f. %s %s is under-aged.%n", firstName, secondName, age, weight, height, profession, averageGrades, firstName, secondName);
                } else {
                    System.out.printf("%s %s is %d years old. Her weight is %.1f and she is %dcm tall. She is a %s with an average grade of %.3f", firstName, secondName, age, weight, height, profession, averageGrades);
                }
            }
        }
    }
}



