
package Controller;

import View.matchingGameMenu;
import Controller.cardController;
import Model.CardsList;
import utility.MainData;
import Model.Card;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

public class matchingGameController {

    matchingGameMenu mgm = new matchingGameMenu();

    ArrayList<String> Front = new ArrayList<String>();
    ArrayList<String> Back = new ArrayList<String>();
    ArrayList Weight = new ArrayList<Integer>();

    ArrayList<String> frontTemp = new ArrayList<String>();
    ArrayList<String> backTemp = new ArrayList<String>();

    public Random rand = new Random();
    public int v;

    boolean frontSel = false;
    boolean backSel = false;

    String sFrontCard = "";
    String sBackCard = "";

    public matchingGameController() {
        mgm.setVisible(true);
        gameOpen();
        // if frontButton pressed, disable the rest of them depending on what button was
        // pressed
        // Same for back

        frontLogic();
        backLogic();

        gamer();

    }

    public void cardAdd() {
        /*
         * Front.add("A");
         * Front.add("B");
         * Front.add("C");
         * Front.add("D");
         * Front.add("E");
         * 
         * Back.add("a");
         * Back.add("b");
         * Back.add("c");
         * Back.add("d");
         * Back.add("e");
         */

        CardsList cl = new CardsList();
        ArrayList cc = cl.getCardList();

        for (int i = 0; i < cc.size() - 1; i++) {

            String[] g = cc.get(i).toString().split(",");
            Front.add(g[0]);
            frontTemp.add(g[0]);
            Back.add(g[1]);
            backTemp.add(g[1]);
            i++;
            // No clue why this works. I wonder if it's skipping or tracing back on itself.
            // Either way, from my testing it looked fine.5

        }

        Weight.add(1);
        Weight.add(1);
        Weight.add(1);
        Weight.add(1);
        Weight.add(1);
    }

    public void gameOpen() {

        cardAdd();

        // Front cards
        Collections.shuffle(Front);
        mgm.getjButton2().setText(Front.get(0));
        mgm.getjButton3().setText(Front.get(1));
        mgm.getjButton4().setText(Front.get(2));
        mgm.getjButton5().setText(Front.get(3));
        mgm.getjButton6().setText(Front.get(4));

        // Back Cards
        Collections.shuffle(Back);
        mgm.getjButton7().setText(Back.get(0));
        mgm.getjButton8().setText(Back.get(1));
        mgm.getjButton9().setText(Back.get(2));
        mgm.getjButton10().setText(Back.get(3));
        mgm.getjButton11().setText(Back.get(4));

        // Front.clear();
        // Back.clear();
        // cardAdd();

        System.out.println("Should be open");
    }

    // Front Buttons
    // =======================================================================================================
    public void FB1() {
        mgm.getjButton2().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Button 1");
                        sFrontCard = Front.get(0);
                        System.out.println(sFrontCard);
                        frontSel = true;
                        gamer();
                    }
                });
    }

    public void FB2() {
        mgm.getjButton3().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Button 2");
                        sFrontCard = Front.get(1);
                        System.out.println(sFrontCard);
                        frontSel = true;
                        gamer();
                    }
                });
    }

    public void FB3() {
        mgm.getjButton4().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Button 3");
                        sFrontCard = Front.get(2);
                        System.out.println(sFrontCard);
                        frontSel = true;
                        gamer();
                    }
                });
    }

    public void FB4() {
        mgm.getjButton5().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Button 4");
                        sFrontCard = Front.get(3);
                        System.out.println(sFrontCard);
                        frontSel = true;
                        gamer();
                    }
                });
    }

    public void FB5() {
        mgm.getjButton6().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Button 5");
                        sFrontCard = Front.get(4);
                        System.out.println(sFrontCard);
                        frontSel = true;
                        gamer();
                    }
                });
    }
    // ====================================================================================================

    public void frontLogic() {
        FB1();
        FB2();
        FB3();
        FB4();
        FB5();

        gamer();
        // System.out.println(sFrontCard);
    }

    // Back Buttons
    // =======================================================================================================
    public void BB1() {
        mgm.getjButton7().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Back 1");
                        sBackCard = Back.get(0);
                        System.out.println(sBackCard);
                        backSel = true;
                        gamer();
                    }
                });
    }

    public void BB2() {
        mgm.getjButton8().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Back 2");
                        sBackCard = Back.get(1);
                        System.out.println(sBackCard);
                        backSel = true;
                        gamer();
                    }
                });
    }

    public void BB3() {
        mgm.getjButton9().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Back 3");
                        sBackCard = Back.get(2);
                        System.out.println(sBackCard);
                        backSel = true;
                        gamer();
                    }
                });
    }

    public void BB4() {
        mgm.getjButton10().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Back 4");
                        sBackCard = Back.get(3);
                        System.out.println(sBackCard);
                        backSel = true;
                        gamer();
                    }
                });
    }

    public void BB5() {
        mgm.getjButton11().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println("Back 5");
                        sBackCard = Back.get(4);
                        System.out.println(sBackCard);
                        backSel = true;
                        gamer();
                    }
                });
    }

    // ===========================================================================================

    public void backLogic() {
        BB1();
        BB2();
        BB3();
        BB4();
        BB5();

        gamer();
        // System.out.println(sFrontCard);
    }

    // =============================================================================

    public void gamer() {
        if (frontSel && backSel) {
            System.out.print("Selector works");
            redo();

            if (frontTemp.indexOf(sFrontCard) == backTemp.indexOf(sBackCard)) {
                System.out.println("Correct!");

                // -----------------------------------------------------
                // Front Disable
                if (Front.indexOf(sFrontCard) == 0) {
                    mgm.JB2_dis();
                    System.out.print("Got it");
                }
                if (Front.indexOf(sFrontCard) == 1) {
                    mgm.JB3_dis();
                    System.out.print("Got it");
                }
                if (Front.indexOf(sFrontCard) == 2) {
                    mgm.JB4_dis();
                    System.out.print("Got it");
                }
                if (Front.indexOf(sFrontCard) == 3) {
                    mgm.JB5_dis();
                    System.out.print("Got it");
                }
                if (Front.indexOf(sFrontCard) == 4) {
                    mgm.JB6_dis();
                    System.out.print("Got it");
                }
                // -------------------------------------------------

                if (Back.indexOf(sBackCard) == 0) {
                    mgm.JB7_dis();
                }
                if (Back.indexOf(sBackCard) == 1) {
                    mgm.JB8_dis();
                }
                if (Back.indexOf(sBackCard) == 2) {
                    mgm.JB9_dis();
                }
                if (Back.indexOf(sBackCard) == 3) {
                    mgm.JB10_dis();
                }
                if (Back.indexOf(sBackCard) == 4) {
                    mgm.JB11_dis();
                }
                // ----------------------------------------------------
            } else {
                System.out.println("Incorrect. Boo. You suck pal.");
                // Put some incorrect logic here. Turn the buttons red perhaps?
                if (Front.indexOf(sFrontCard) == 0) {
                    mgm.redB2();
                }
                if (Front.indexOf(sFrontCard) == 1) {
                    mgm.redB3();

                }
                if (Front.indexOf(sFrontCard) == 2) {
                    mgm.redB4();
                    System.out.print("Got it");
                }
                if (Front.indexOf(sFrontCard) == 3) {
                    mgm.redB5();
                    System.out.print("Got it");
                }
                if (Front.indexOf(sFrontCard) == 4) {
                    mgm.redB6();
                    System.out.print("Got it");
                }
                // -------------------------------------------------

                if (Back.indexOf(sBackCard) == 0) {
                    mgm.redB7();
                }
                if (Back.indexOf(sBackCard) == 1) {
                    mgm.redB8();
                    ;
                }
                if (Back.indexOf(sBackCard) == 2) {
                    mgm.redB9();
                }
                if (Back.indexOf(sBackCard) == 3) {
                    mgm.redB10();
                }
                if (Back.indexOf(sBackCard) == 4) {
                    mgm.redB11();
                }

            }

            frontSel = false;
            backSel = false;
        }
    }

    
    public void redo() {
        mgm.antiB2();
        mgm.antiB3();
        mgm.antiB4();
        mgm.antiB5();
        mgm.antiB6();

        mgm.antiB7();
        mgm.antiB8();
        mgm.antiB9();
        mgm.antiB10();
        mgm.antiB11();
    }
    // =============================================================================================

    // The logic should be pretty simple. When a card is clicked
    // The program should find what card was selected from the arraylists Front and
    // Back
    // Then compare the positions in both.
    // If the positions are the same, disable the buttons and award a point. If not,
    // take away a point
    // After all the buttons have been disabled, restart the window, which will
    // reshuffle the arraylists for the user

}
