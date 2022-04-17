/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.loginScreen;
import View.studentMenu;
import Model.User;
import Model.UserList;
import Controller.studentController;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.cardMenu;
import Model.CardsList;
import Model.Card;
/**
 *
 * @author Anita
 */
public class cardController {
    private int numClicked = 0;
    private cardMenu crd = new cardMenu();
    private ArrayList<Card> sigh = CardsList.getCardList();
    public cardController(){
       /* String[] cardFront = { "A", "B"};
        String[] cardBack = { "A Back", "B Back"};
        */
       crd.setVisible(true);
       System.out.println(sigh.get(0).toString());
       next();
       back();
        
    }

 
    public cardMenu getCrd() {
        return crd;
    }


    public void setCrd(cardMenu crd) {
        this.crd = crd;
    }
    
    public void next(){
        
        crd.getBtnNext().addActionListener(
        
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        
                        try{
                        System.out.println(CardsList.getCardList().get(numClicked).getCardFront());
                        crd.getBtnCard().setText(CardsList.getCardList().get(numClicked).getCardFront());
                        numClicked++;
                        }
                        catch(Exception x){
                            x.printStackTrace();
                            System.out.println("You may have run out of cards");
                        }  
                    }
                }// end of NEW actionListener
        );// End of action listener
    }
    
        public void back(){
        crd.getBtnPrevious().addActionListener(
        
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                        System.out.println(CardsList.getCardList().get(numClicked).getCardFront());
                        crd.getBtnCard().setText(CardsList.getCardList().get(numClicked).getCardFront());
                        numClicked--;
                        }
                        catch(Exception x){
                            x.printStackTrace();
                            System.out.println("You may have run out of cards");
                        }
                    }
                }// end of NEW actionListener
        );// End of action listener
    }
    
}
