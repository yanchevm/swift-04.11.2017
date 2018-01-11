package Task1;

public class Task1_Deck {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                System.out.println(new Card(i,j));
            }
        }

    }
}
