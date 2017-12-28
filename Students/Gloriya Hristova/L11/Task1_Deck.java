package generics;

import java.util.Scanner;


class MyClass{
    static int i;
    static String name;
}


class Deck{

    String rank,colour;
    void printCards(){
        for(int i =0;i<4;i++){
            colour = Card.CardSuit.values()[i].toString();
            for (int k = 0;k<13;k++){
                rank = Card.CardRank.values()[k].toString();
                System.out.println(rank+" of "+colour);
            }
        }
    }
}


class Card implements Comparable<Card>{
    int index;
    boolean flagR = false;
    boolean flagC = false;
    Scanner input = new Scanner(System.in);
    String colour,rank,obj;
    
    enum CardSuit{ 
      Clubs,
      Diamonds,
      Hearts,
      Spades; 
   }
    
    enum CardRank{
       Two(0),
       Three(1),
       Four(2),
       Five(3),
       Six(4),
       Seven(5),
       Eight(6),
       Nine(7),
       Ten(8),
       Jack(9),
       Queen(10),
       King(11),
       Ace(12);
       
       int index;
       CardRank(int index){
           this.index=index;
       }
    }
    
    Card(){
        do{
            System.out.println("Enter rank:");
            rank = input.nextLine();
            for(int i = 0; i<13;i++){
                if(rank.equals(CardRank.values()[i].toString())){
                    flagR = true;
                    break;
                }
                
            }
            if(flagR==false){
                System.out.println("Typographical error.");
            }
        }while(flagR ==false);
        this.rank=rank;
      
        do{
            System.out.println("Enter colour:");
            colour = input.nextLine();
            for(int i = 0; i<4;i++){
                if(colour.equals(CardSuit.values()[i].toString())){
                    flagC = true;
                    break;
                }
            }
            if(flagC==false){
                System.out.println("Typographical error.");
            }
        }while(flagC ==false);
        this.colour=colour;
    }
    //valueOf(Class<Card> CardRank, rank);
    int indexOf(String rank){
        switch(rank){
            case "Two": index = 0;break;
            case "Three": index = 1;break;
            case "Four": index = 2;break;
            case "Five": index = 3;break;
            case "Six": index = 4;break;
            case "Seven": index = 5;break;
            case "Eigth": index = 6;break;
            case "Nine": index = 7;break;
            case "Ten": index = 8;break;
            case "Jack": index = 9;break;
            case "Queen": index = 10;break;
            case "King": index = 11;break;
            case "Ace": index = 12;break;
        }
        return index;}
   
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(rank).append(" of ").append(colour);
        obj = str.toString();
        return obj;
    }
    
    
    @Override
    public final int compareTo(Card t){
        if(MyClass.i>t.indexOf(t.rank)){
            System.out.println(MyClass.name+" is greater than "+t.toString()+". ");
        }
        if(MyClass.i<t.indexOf(t.rank)){
            System.out.println(t.toString()+" is greater than "+MyClass.name+". ");
        }
        if(MyClass.i==t.indexOf(t.rank)){
            System.out.println("Equal ranks.");
        }
        System.out.println();
        
        return 0;
    }

    
    
}
class Task1_Deck{
    public static void main(String [] args){
        Card newCard = new Card();
        Card card = new Card();
        
        MyClass.i = newCard.indexOf(newCard.rank);
        MyClass.name = newCard.toString();
        
        newCard.compareTo(card);
        
        Deck one = new Deck();
        one.printCards();
    }
}