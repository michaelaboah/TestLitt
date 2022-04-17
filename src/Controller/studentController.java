
package Controller;

import View.studentMenu;
import View.cardMenu;
import Controller.cardController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;

public class studentController {
    
    studentMenu studentMenu = new studentMenu();
    cardController crd;
    
    
    
    public studentController(){
    this.studentMenu = new View.studentMenu();
    studentMenu.setVisible(true);
        
        System.out.println("YUP!");
        
        //viewCardMenu();
        //cardMenuLoad();
    }
    
    
    
       public void cardMenuLoad(){
           
           studentMenu stu = new studentMenu();
           //stu.jButton2ActionPerformed();
           /*
           studentMenu.getjButton1().addActionListener(
             new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
               System.out.println("IT WORKS!");
                
                }
            }
        ); 
*/
      }
       /*
       public void closeOut(){
           studentMenu.setVisible(false);
           this.studentMenu.setVisible(false);
           
           studentMenu.dispose();
           this.studentMenu.dispose();
           
           WindowEvent closeWindow = new WindowEvent(studentMenu, WindowEvent.WINDOW_CLOSING);
           Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
  
       }
       */
       
       //Trash Garbage
       public void viewCardMenu(){
           System.out.print("Button Pressed!");
           //cardMenu goblin = new cardMenu();
            //this.studentMenu.setVisible(true);
            studentMenu.dispose();
            
            new cardMenu().setVisible(true);
            cardController crdCont = new cardController();
            //this.Close();
       }

    public studentMenu getStudentMenu() {
        return studentMenu;
    }

    public void setStudentMenu(studentMenu studentMenu) {
        this.studentMenu = studentMenu;
    }

}