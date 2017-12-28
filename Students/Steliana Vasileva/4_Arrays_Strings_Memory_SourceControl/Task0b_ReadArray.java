import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] newIntArray = new int[N];

        for (int i = 0; i < N; i++) {
            newIntArray[i] = sc.nextInt(); //Милен: БРАВО! Използваш правилния метод :)
            if (i == N - 1) {
                System.out.printf("%d", newIntArray[i]);
            } else {
                System.out.printf("%d" + ", ", newIntArray[i]);
            }

        }
    }
}
