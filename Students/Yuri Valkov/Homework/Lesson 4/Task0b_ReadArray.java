package Task0b_ReadArray;
import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        String numb = sc.next();
        System.out.print("Please, enter "+numb +"  numbers: ");
        String numb2 = sc.nextLine();
        String numb2Arr[] =  numb2.split(" "); //Милен: Къде е гаранцията, че потебителя в въвел точно толкова числа ?
        int arr2[] = new int[Integer.parseInt(numb)];
            for (int i = 0; i< arr2.length; i++ ) {
                arr2[i] = Integer.parseInt(numb2Arr[i]);
                if ( i == arr2.length-1) {
                    System.out.println(arr2[i]);
                }
                else {
                    System.out.println(arr2[i] + ", ");
                }
            }

    }
}
