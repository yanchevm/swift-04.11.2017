
public class Task1_Deck {

    public static void main(String[] args) {

        Card.CardSuit[] colors = {Card.CardSuit.CLUBS, Card.CardSuit.DIAMONDS, Card.CardSuit.HEARTS, Card.CardSuit.SPADES};
        Card.CardRang[] rangs = {Card.CardRang.TWO, Card.CardRang.THREE, Card.CardRang.FOUR, Card.CardRang.FIVE, Card.CardRang.SIX,
                Card.CardRang.SEVEN, Card.CardRang.EIGHT, Card.CardRang.NINE, Card.CardRang.TEN, Card.CardRang.JACK, Card.CardRang.QUEEN, Card.CardRang.KING, Card.CardRang.ACE};


        Card newDeck = new Card(colors, rangs);
        newDeck.toString();
        }
    }
