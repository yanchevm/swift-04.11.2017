package Homework.HWLecture11.Task1;

public class Task1_Deck {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                System.out.println(new Card(i,j));
            }
        }

    }
}
