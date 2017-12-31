import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5_ChildPlay {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter number of children:");
        int n = sc.nextInt();

        System.out.println("Enter the height of each child, separated by space:");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        ArrayList<Integer> arrL = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrL.add(Integer.parseInt(arr[i]));
        }

        int count = 0;
        for (int i = 0; i < arrL.size(); i++) {
            boolean removed = false;
            for (int j = 0; j < arrL.size()-1; j++) {
                if(arrL.get(j) < arrL.get(j+1)){
                    arrL.remove(j+1);
                    removed = true;
                }
            }
            if(!removed){
                break;
            }
            else{
                count++;
            }
        }

        System.out.println(count);
    }
}
