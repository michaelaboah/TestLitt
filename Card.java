/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author miker
 */
public class Card {
    
    private String cardFront;
    private String cardBack;

    public String getCardFront() {
        return cardFront;
    }

    public void setCardFront(String cardFront) {
        this.cardFront = cardFront;
    }

    public String getCardBack() {
        return cardBack;
    }

    public void setCardBack(String cardBack) {
        this.cardBack = cardBack;
    }
    
     public Card(){ 
    }
    
    public Card(String cardFront, String cardBack){
        this.cardFront = cardFront;
        this.cardBack = cardBack;
    }

    @Override
    public String toString() {
        //return "Card [cardBack=" + cardBack + ", cardFront=" + cardFront + "]";
        
        return cardFront + "," + cardBack;
    }

    
    
    
}
