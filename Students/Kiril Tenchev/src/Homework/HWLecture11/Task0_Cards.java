package Homework.HWLecture11;

public class Task0_Cards {
    public static void main(String[] args) {
       // System.out.print(java.util.Arrays.asList(CardSuit.values()));
        for (CardSuit e:CardSuit.values()) {
            System.out.print(e+" ");
        }
        System.out.println();
        for (CardRank b:CardRank.values()) {
            System.out.print(b+" ");
        }

    }

    public enum CardSuit{
        Clubs,
        Diamonds,
        Hearts,
        Spades

    }
    public enum CardRank{
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King,
        Ace
    }
}
