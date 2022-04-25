/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import utility.MainData;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.cardMenu;
import Model.Card;
/**
 *
 * @author Anita
 */
public class cardController {
    private int numClicked = 0;
    private cardMenu crd = new cardMenu();
    private ArrayList<Card> sigh = MainData.getCardsList();
    public cardController(){

       crd.setVisible(true);
       System.out.println(sigh.get(0).toString());
       next();
       back();
        
    }

 
    public cardMenu getCrd() {
        return crd;
    }
    public void cardOpen(){
        
        crd.setVisible(true);
        //crd.btnCard.setText(MainData.getCards().get(0).getFront());
        
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
                        System.out.println(MainData.getCardsList().get(numClicked).getCardFront());
                        crd.getBtnCard().setText(MainData.getCardsList().get(numClicked).getCardFront());
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
                        System.out.println(MainData.getCardsList().get(numClicked).getCardFront());
                        crd.getBtnCard().setText(MainData.getCardsList().get(numClicked).getCardFront());
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
