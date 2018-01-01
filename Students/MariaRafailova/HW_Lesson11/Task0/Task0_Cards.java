package Task0;

import java.util.Arrays;

public class Task0_Cards {
    public static void main(String[] args) {

        System.out.println(Arrays.asList(CardSuit.values()));

        System.out.println(Arrays.asList(CardRank.values()));

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
