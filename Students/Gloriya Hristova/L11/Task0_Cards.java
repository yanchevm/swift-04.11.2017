package generics;

public class Task0_Cards {
   private enum CardSuit{ 
      Clubs,
      Diamonds,
      Hearts,
      Spades; 
   };
   
   private enum CardRank{
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
       Ace;
   
   }
   
   public static void main(String []args){
	//Милен: БРАВО! 
	// Какво ще стане ако се наложи да добавиш по още един запис в двата ENUM-a ? 
        // Така както си написала цикъла, ще ги разпечаташ ли ? :)
       for(int i=0;i<4;i++){
           if(i!=3){
               System.out.print(CardSuit.values()[i]+", ");
           }else{
                System.out.print(CardSuit.values()[i]+"\n");
           }
       }
       for(int i=0;i<13;i++){
           if(i!=12){
               System.out.print(CardRank.values()[i]+", ");
           }else{
                System.out.print(CardRank.values()[i]+"\n");
           }
       }
   }
   
}
