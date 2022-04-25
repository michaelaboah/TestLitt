
package Controller;

import View.studentMenu;
import View.cardMenu;



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

}