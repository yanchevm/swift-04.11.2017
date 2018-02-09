import java.util.Scanner;

public class Task2_CommonSubset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] firstSet = new int[N];

        int [] secondSet = new int[M];

        for (int i = 0; i < N; i++){
            firstSet[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++){
            secondSet[i] = sc.nextInt();

        }
        int counter = 0;
        for (int i = 0; i < firstSet.length; i++){


            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i] == secondSet[j]) {
                    System.out.printf("%d ", firstSet[i]);
                } else {
                    counter++;
                }
            }
            if (counter==secondSet.length){
                System.out.println("NO");
                break;
            }
        }

    }
}
