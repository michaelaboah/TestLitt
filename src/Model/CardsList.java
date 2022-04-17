/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author miker
 */
public class CardsList {
    private static ArrayList <Card> cardList = new ArrayList<Card>();
    
    public CardsList(){
        
//        cardList = new ArrayList <>();
        
        Card card1 = new Card ("What is Biology?", "Deals with living organisms");
        Card card2 = new Card ("What is Science?", "Study of the physical and natural world through observation and experiment");
        
        cardList.add(card1);            
        cardList.add(card2);   
    }
    
    public static ArrayList<Card> getCardList() {
        
        Card card1 = new Card ("What is Biology?", "Deals with living organisms");
        Card card2 = new Card ("What is Science?", "Study of the physical and natural world through observation and experiment");
        
        cardList.add(card1);            
        cardList.add(card2);   
        
        return cardList;
    }

    public static void setCardList(ArrayList<Card> cardList) {
        CardsList.cardList = cardList;
    }   
}
