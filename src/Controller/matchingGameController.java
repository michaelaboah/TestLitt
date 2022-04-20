
package Controller;

import View.matchingGameMenu;
import Controller.cardController;
import Model.CardsList;
import utility.MainData;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class matchingGameController {
   
    matchingGameMenu mgm = new matchingGameMenu();
    
    static ArrayList<String> Front = new ArrayList<String>();
	static ArrayList<String> Back = new ArrayList<String>();
	static ArrayList Weight = new ArrayList<Integer>();
	
	public static Random rand = new Random();
	public static int v;
	
    public matchingGameController() {

    }
    
    public static void cardAdd() {
		Front.add("A");
		Front.add("B");
		Front.add("C");
		Front.add("D");
		Front.add("E");
		
		Back.add("a");
		Back.add("b");
		Back.add("c");
		Back.add("d");
		Back.add("e");
		
		Weight.add(1);
		Weight.add(1);
		Weight.add(1);
		Weight.add(1);
		Weight.add(1);
	}
    
    public void gameOpen(){
    	
    	cardAdd();
    	
    	//Front cards
    	Collections.shuffle(Front);
        mgm.getjButton2().setText(Front.get(0));
        mgm.getjButton3().setText(Front.get(1));
        mgm.getjButton4().setText(Front.get(2));
        mgm.getjButton5().setText(Front.get(3));
        mgm.getjButton6().setText(Front.get(4));
        
        //Back Cards
        Collections.shuffle(Back);
        mgm.getjButton7().setText(Back.get(0));
        mgm.getjButton8().setText(Back.get(1));
        mgm.getjButton9().setText(Back.get(2));
        mgm.getjButton10().setText(Back.get(3));
        mgm.getjButton11().setText(Back.get(4));
        
        Front.clear();
        Back.clear();
        cardAdd();

        mgm.setVisible(true);
    }
    //The logic should be pretty simple. When a card is clicked
    //The program should find what card was selected from the arraylists Front and Back
    //Then compare the positions in both. 
    //If the positions are the same, disable the buttons and award a point. If not, take away a point
    //After all the buttons have been disabled, restart the window, which will reshuffle the arraylists for the user
    
    
}
