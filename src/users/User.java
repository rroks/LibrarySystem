package users;

/**
 * Created by Rroks on 2016/11/25.
 */
abstract public class User {
    protected String username;
    protected int userID;
    protected String userPassword;

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }
    public int getUserID(){
        return this.userID;
    }

    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public String getUserPassword(){return userPassword;}

    public void checkCategory(){
    }
    public void printCategory(){}
    public void findItem(String item){}
}
