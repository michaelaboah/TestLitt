
package Model;

import java.util.ArrayList;


public class UserList {
    
    private static ArrayList <User> users;
    
    public UserList(){
        
        users = new ArrayList <>();
        
        User user1 = new User ("Mister", "Java");
        User user2 = new User ("Miss", "Java1");
        User user3 = new User ("Misses", "Java2");
        User user4 = new User ("Sir", "Java3");
        
        users.add(user1);            
        users.add(user2);   
        users.add(user3);
        users.add(user4); 
    }
    
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserList.users = users;
    }   
}