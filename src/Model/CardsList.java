package Model;

import java.util.ArrayList;
public class CardsList {
    private static ArrayList <Card> cardList = new ArrayList<Card>();
    
    public CardsList(){
        
//        cardList = new ArrayList <>();
        
        Card card1 = new Card ("What is Biology?", "Deals with living organisms");
        Card card2 = new Card ("What is Science?", "Study of the physical and natural world through observation and experiment");
        Card card3 = new Card("Side A Card 1", "Side B Card 1");
        Card card4 = new Card("Side A Card 2", "Side B Card 2");
        Card card5 = new Card("Side A Card 3", "Side B Card 3");
        
        cardList.add(card1);            
        cardList.add(card2);
        cardList.add(card3);     
        cardList.add(card4);  
        cardList.add(card5);   
    }
    
    public static ArrayList<Card> getCardList() {
        
        Card card1 = new Card ("What is Biology?", "Deals with living organisms");
        Card card2 = new Card ("What is Science?", "Study of the physical and natural world through observation and experiment");
        Card card3 = new Card("Side A Card 1", "Side B Card 1");
        Card card4 = new Card("Side A Card 2", "Side B Card 2");
        Card card5 = new Card("Side A Card 3", "Side B Card 3");
        
        cardList.add(card1);            
        cardList.add(card2);
        cardList.add(card3);     
        cardList.add(card4);  
        cardList.add(card5);  
        
        return cardList;
    }

    public static void setCardList(ArrayList<Card> cardList) {
        CardsList.cardList = cardList;
    }   
}
