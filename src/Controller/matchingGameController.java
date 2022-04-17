
package Controller;

import View.matchingGameMenu;
import Controller.cardController;
import Model.CardsList;
import utility.MainData;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;

public class matchingGameController {
   
    matchingGameMenu mgm = new matchingGameMenu();

    public matchingGameController() {

    }
    
    public void gameOpen(){
        mgm.getjButton2().setText(MainData.getCardsList().get(0).getCardFront());
        mgm.getjButton3().setText(MainData.getCardsList().get(0).getCardFront());
        mgm.getjButton4().setText(MainData.getCardsList().get(0).getCardFront());
        mgm.getjButton5().setText(MainData.getCardsList().get(0).getCardFront());
        mgm.getjButton6().setText(MainData.getCardsList().get(0).getCardFront());
        mgm.getjButton7().setText(MainData.getCardsList().get(0).getCardBack());
        mgm.getjButton8().setText(MainData.getCardsList().get(0).getCardBack());
        mgm.getjButton9().setText(MainData.getCardsList().get(0).getCardBack());
        mgm.getjButton10().setText(MainData.getCardsList().get(0).getCardBack());
        mgm.getjButton11().setText(MainData.getCardsList().get(0).getCardBack());




        mgm.setVisible(true);
    }
    
    
}
