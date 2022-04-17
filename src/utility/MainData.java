
package utility;
import java.util.ArrayList;

import Model.Card;
import Model.User;


public class MainData {

    private static ArrayList<Card> cards = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();


    public static ArrayList<Card> getCards() {
        return cards;
    }
    public static void setCards(ArrayList<Card> cards) {
        MainData.cards = cards;
    }
    public static ArrayList<User> getUsers() {
        return users;
    }
    public static void setUsers(ArrayList<User> users) {
        MainData.users = users;
    }




}
