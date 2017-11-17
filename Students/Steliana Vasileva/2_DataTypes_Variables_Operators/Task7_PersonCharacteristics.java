import java.util.Scanner;


public class Task7_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int yearOfBirth = Integer.parseInt(scanner.nextLine());
        int yearsOld = Math.abs(yearOfBirth-2017); // Милен: Програмта ще работи ли правилно през 2018 ? Може да експериментираш с https://docs.oracle.com/javase/8/docs/api/java/time/Year.html#now--
        double weight = Double.parseDouble(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String profession = scanner.nextLine();

        System.out.printf("%s" + " " + "%s" + " is " + "%.2d" + " years old. His weight is" + " %f" + " and he is " + "%d" + " cm tall. He is a "+ "%s" + ".", firstName, secondName, yearsOld, weight, height, profession);



    }
}
