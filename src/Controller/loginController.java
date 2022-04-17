package Controller;

import View.loginScreen;
//import View.studentMenu;
import Model.User;
import Model.UserList;
//import Controller.studentController;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginController {
    
    public User user;
    public ArrayList <User> users;
    public loginScreen loginScreen;
    public int i;
    public boolean isValidated;
    //studentMenu studentMenu = new studentMenu();
    //studentController studentctrl;
    
    public loginController(){
        
        this.user = new Model.User();
        UserList userList = new Model.UserList();
        this.users = new ArrayList<User>();
        this.users = userList.getUsers();
       
        this.loginScreen = new View.loginScreen();
        loginScreen.setVisible(true);
        validate();
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public loginScreen getLoginScreen() {
        return loginScreen;
    }

    public void setLoginScreen(loginScreen loginScreen) {
        this.loginScreen = loginScreen;
    }
    
    //search list of the username & password then it will take you to next screen
    public void validate(){
     
         loginScreen.getjButton1().addActionListener(
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String user = loginScreen.getUserBox().getText();
                String password = loginScreen.getjPasswordField1().getText();

                for (int i = 0; i < UserList.getUsers().size(); i++) {

                    if(UserList.getUsers().get(i).getUsername().equals(user) && UserList.getUsers().get(i).getPassword().equals(password)){
                        //System.out.println("Login Approved");
                        loginScreen.dispose();
                        //studentMenu.setVisible(true);
                        studentController studentctrl = new studentController();
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
