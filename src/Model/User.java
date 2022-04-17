
package Model;

public class User {
    
    String username;
    String password;


    
    public User(){
        username = "";
        password = "";      
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String password) {
        this.password = password;
    }
    
       public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
