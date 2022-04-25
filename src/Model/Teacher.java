
package Model;

/**
 * @author Anita
 */

public class Teacher {
    
    private String teacherUsername;
    private String teacherPassword;    
    
    public Teacher(String teacherUsername, String teacherPassword){
        this.teacherUsername = teacherUsername;
        this.teacherPassword = teacherPassword;
    }

    public Teacher(){
    }
    
    public String getTeacherUsername() {
        return teacherUsername;
    }

    public void setTeacherUsername(String teacherUsername) {
        this.teacherUsername = teacherUsername;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    @Override
    public String toString() {
        return "Teacher [teacherPassword=" + teacherPassword + ", teacherUsername=" + teacherUsername + "]";
    }    
    
}
