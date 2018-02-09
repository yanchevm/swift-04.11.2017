package Homework.HWLecture11.Task1;

import java.util.Random;

public class Card implements Comparable<Card> {
    private Suit suit;
    private Rank rank;

    public Card(int one,int two ){
        this.rank=Rank.getRank(two);
        this.suit=Suit.getSuit(one);
    }

    @Override
    public int compareTo(Card t) {
        return this.rank.compareTo(t.rank);
    }

    @Override
    public String toString() {
        return (this.rank+" of "+this.suit); //Милен: Нямаш нужда от скоби тук. Също и от this. 
    }
	
	//Милен: Добре си направил енъмите! 
        public enum Suit {
            Clubs(1),
            Diamonds(2),
            Hearts(3),
            Spades(4);

            int indexSuit;
            Suit(int indexSuit){
                this.indexSuit = indexSuit;
            }
            static Suit getSuit(int indexSuit){
                Suit[] arraySuit = Suit.values();
                for (Suit suit: arraySuit) {
                    if(suit.indexSuit==indexSuit){
                        return suit;
                    }
                }
                return null;
            }
        }
        public enum Rank {
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

            int indexRank;
            Rank(int indexRank){
                this.indexRank=indexRank;
            }

            static Rank getRank(int indexRank){
                Rank[] arrayRank = Rank.values();
                for (Rank rank:arrayRank) {
                    if(rank.indexRank==indexRank){
                        return rank;
                    }
                }
                return null;
            }
        }
}

