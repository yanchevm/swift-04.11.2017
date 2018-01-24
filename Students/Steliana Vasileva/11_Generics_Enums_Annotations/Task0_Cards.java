public class Task0_Cards {

    public enum CardSuit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    public enum CardRank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public static void main(String[] args) {

        for (CardSuit c: CardSuit.values()){
            System.out.printf("%s, ", c);
        }
        System.out.println();

        for (CardRank f: CardRank.values()){
            System.out.printf("%s, ", f);
        }
    }

}
