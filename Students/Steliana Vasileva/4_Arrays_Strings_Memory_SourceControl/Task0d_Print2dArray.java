import java.util.Scanner;

public class Task0d_Print2dArray {
    public static void main(String[] args) {

        int [][] new2dArray = new int[4][4];

        int number = 1;

        for (int rows = 0; rows < 4; rows++){ //Милен: Тук вмето 4 е добре да използваш new2dArray.length
            System.out.println();

            for (int columns = 0; columns < 4; columns++){ //Милен: Тук вместо 4 е добре да използваш new2dArray[0].length

            new2dArray[rows][columns] = number++;
            System.out.printf("%d" + " ", new2dArray[rows][columns]);

            }
        }
    }
}
