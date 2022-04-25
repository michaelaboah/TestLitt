
package Controller;

import View.studentMenu;
import View.cardMenu;
import View.matchingGameMenu;



public class studentController {
    
    studentMenu studentMenu = new studentMenu();
    cardController crd;
    
    
    
    public studentController(){
        this.studentMenu = new View.studentMenu();
        studentMenu.setVisible(true);
            
        System.out.println("YUP!");
    }
    
    
    
    public void cardMenuLoad(){
        studentMenu stu = new studentMenu();
    }
      

    public studentMenu getStudentMenu() {
        return studentMenu;
    }

    public void setStudentMenu(studentMenu studentMenu) {
        this.studentMenu = studentMenu;
    }
    
    public void viewMGM() {
        System.out.print("Button 2 Pressed!");
        // cardMenu goblin = new cardMenu();
        // this.studentMenu.setVisible(true);
        studentMenu.dispose();
        new matchingGameMenu().setVisible(true);
        matchingGameController MGM = new matchingGameController();
        // this.Close();
    }
}