package Model;

import java.util.ArrayList;

import utility.JsonUtil;
import utility.MainData;

public class SavedData{

    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
   


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

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }


    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }


    @Override
    public String toString() {
        return "SavedData [cards=" + cards + ", teachers=" + teachers + ", users=" + users + "]";
    }


    public static void readAll(String filePath){
        SavedData retrieved = (SavedData) JsonUtil.readJson(filePath, new SavedData());
        MainData.setCardsList(retrieved.getCards());
        MainData.setUserList(retrieved.getUsers());
        MainData.setTeachers(retrieved.getTeachers());
        System.out.println(retrieved);
    }


    public static void saveAll(String filepath){
        var save = new SavedData();
        save.setCards(MainData.getCardsList());
        save.setUsers(MainData.getUserList());
        save.setTeachers(MainData.getTeachers());
        //Copy whats above if things need to be added
        JsonUtil.writeJson(filepath, save);
    }
}
