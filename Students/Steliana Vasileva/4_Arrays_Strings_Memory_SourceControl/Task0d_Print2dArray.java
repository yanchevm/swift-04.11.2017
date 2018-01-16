package src;

public class Task0d_Print2dArray {
    public static void main(String[] args) {

        int [][] new2dArray = new int[4][4];

        int number = 1;

        for (int rows = 0; rows < new2dArray.length; rows++){
            System.out.println();

            for (int columns = 0; columns < new2dArray[0].length; columns++){

            new2dArray[rows][columns] = number++;
            System.out.printf("%d" + " ", new2dArray[rows][columns]);

            }
        }
    }
}
