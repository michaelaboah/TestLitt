
package Controller;
import View.teacherMenu;
/**
 *
 * @author Anita
 */
public class teacherController {
   
   teacherMenu teachermenu = new teacherMenu();
   
    
   public teacherController(){
       
       this.teachermenu = new View.teacherMenu();
       teachermenu.setVisible(true);
   } 
    
    
}
