import java.util.Scanner;

public class Task1_SumNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean rightCondition = true;

        do {
            try {
                System.out.println("Please enter two numbers");
                int first = sc.nextInt();
                int second = sc.nextInt();

                if (first == second) {
                    rightCondition=false;
                    throw new newException(first, second);
                } else if (first < 0 || second < 0) {
                    rightCondition=false;
                    throw new NegativeNumbersExc(first, second);
                } else
                    rightCondition=true;
                    System.out.println(first * second);

            } catch (newException e) {
                System.out.println(e.toString());

            } catch (NegativeNumbersExc e) {
                System.out.println("None of the two numbers can be negative");
            }
        } while(!rightCondition);
    }
}
