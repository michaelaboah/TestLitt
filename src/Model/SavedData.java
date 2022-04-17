package Model;

import java.util.ArrayList;

import utility.JsonUtil;
import utility.MainData;

public class SavedData{

    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

   
    public ArrayList<Card> getCards() {
        return cards;
    }


    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }


    public ArrayList<User> getUsers() {
        return users;
    }


    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    

    @Override
    public String toString() {
        return "SavedData [cards=" + cards + ", users=" + users + "]";
    }


    public static void readAll(String filePath){
        SavedData retrieved = (SavedData) JsonUtil.readJson(filePath, new SavedData());
        MainData.setCardsList(retrieved.getCards());
        MainData.setUserList(retrieved.getUsers());
        System.out.println(retrieved);
    }


    public static void saveAll(String filepath){
        var save = new SavedData();
        save.setCards(MainData.getCardsList());
        save.setUsers(MainData.getUserList());
        //Copy whats above if things need to be added
        JsonUtil.writeJson(filepath, save);
    }
}
