import java.util.Scanner;

public class RadomExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int years = sc.nextInt();

        if (name.equals("Milen")) {
                if(years > 18) {
                    System.out.println("Lecturer");
                } else {
                    System.out.println("Student");
                }
            } else if(years<18){
            System.out.println("Underage");
            }

        }
    }

