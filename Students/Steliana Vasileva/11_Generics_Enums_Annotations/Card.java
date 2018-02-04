import java.awt.*;
import java.util.Arrays;

public class Card implements Comparable {

        private CardSuit [] colors;
        private CardRang [] rangs;

    public enum CardSuit {
        CLUBS, DIAMONDS, HEARTS, SPADES;

    }
    public enum CardRang {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public Card(CardSuit[] color, CardRang[] rang) {
        this.colors = color;
        this.rangs = rang;
    }

    @Override
    public String toString() {
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 13; j++) {
                System.out.println(rangs[j] + " of " +  colors[i]);
            }

        } return "";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}

