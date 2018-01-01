package Task1;

public class Card implements Comparable<Card> {
    CardSuit suit;
    CardRank rank;

    public enum CardSuit{
        Clubs(1),
        Diamonds(2),
        Hearts(3),
        Spades(4);

        int index;

        CardSuit(int index) {
            this.index = index;
        }

        static CardSuit getCardSuitByIndex(int index) {
            CardSuit[] arr1 = CardSuit.values();

            for(CardSuit cardSuit : arr1) {
                if (cardSuit.index == index) {
                    return cardSuit;
                }
            }
            return null;
        }
    }

    public enum CardRank{
        Two(1),
        Three(2),
        Four(3),
        Five(4),
        Six(5),
        Seven(6),
        Eight(7),
        Nine(8),
        Ten(9),
        Jack(10),
        Queen(11),
        King(12),
        Ace(13);

        int index;

        CardRank(int index) {
            this.index = index;
        }

        static CardRank getCardRankByIndex(int index) {
            CardRank[] arr1 = CardRank.values();

            for(CardRank cardRang : arr1) {
                if (cardRang.index == index) {
                    return cardRang;
                }
            }
            return null;
        }
    }

    public Card(Integer s, Integer r){
        this.suit = CardSuit.getCardSuitByIndex(s);
        this.rank = CardRank.getCardRankByIndex(r);
    }

    public String toString(){
        return (this.rank +" of "+ this.suit);
    }

    @Override
    public int compareTo(Card t) {
        return this.rank.compareTo(t.rank);
    }


}
