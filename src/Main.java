/*** @author Anita Louise Farah ***/

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;

import Controller.loginController;
import Model.Card;
import Model.SavedData;
import Model.Teacher;
import Model.User;
import utility.JsonUtil;
import utility.MainData;


public class Main {
        
    public static void main(String[] args) {
       
        SavedData.readAll("SavedNew.json");
        

        loginController loginCntl = new loginController();
            
    }
    
}
