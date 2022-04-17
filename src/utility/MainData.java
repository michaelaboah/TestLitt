
package utility;
import java.util.ArrayList;

import Model.*;

public class MainData {

    private static ArrayList<Card> cardsList = new ArrayList<>();
    private static ArrayList<User> userList = new ArrayList<>();


    public static ArrayList<Card> getCardsList() {
        return cardsList;
    }

    public static void setCardsList(ArrayList<Card> cardsList) {
        MainData.cardsList = cardsList;
    }

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList) {
        MainData.userList = userList;
    }



}

