package Controller;

import View.loginScreen;
import utility.MainData;
import Model.Teacher;
//import View.studentMenu;
import Model.User;
//import Controller.studentController;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginController {
    

    public loginScreen loginScreen;
    public int i;

    //studentMenu studentMenu = new studentMenu();
    //studentController studentctrl;
    
    public loginController(){
        this.loginScreen = new View.loginScreen();
        loginScreen.setVisible(true);
        validate();
    }



    public void loginopen(){
        loginScreen.setVisible(true);
    }
    //search list of the username & password then it will take you to next screen
    public void validate(){
     
         loginScreen.getjButton1().addActionListener(
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String userName = loginScreen.getUserBox().getText();
                String password = loginScreen.getjPasswordField1().getText();

                for (int i = 0; i < MainData.getUserList().size(); i++) {

                    if(MainData.getUserList().get(i).getUsername().equals(userName) && MainData.getUserList().get(i).getPassword().equals(password)){
                        //System.out.println("Login Approved");
                        loginScreen.dispose();
                        //studentMenu.setVisible(true);
                        studentController studentctrl = new studentController();
                    }

                    if (MainData.getTeachers().get(i).getTeacherUsername().equals(userName) && MainData.getTeachers().get(i).getTeacherPassword().equals(password)){
                        loginScreen.dispose();
                        teacherController teacherctrl = new teacherController();
                    }

                    else{
                        
                        loginScreen.getCatcher().setForeground(Color.red);
                        loginScreen.getCatcher().setText("Login Fail, Try Again!");
                    } 
                }
               
                
            }
        }
    );    
         
}


}
