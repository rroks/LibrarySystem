package operations;

import users.RegistedUser;

import java.util.HashMap;

/**
 * Created by Rroks on 2016/11/26.
 */
public class FindUser {
    FindUser(){}
    public static <U extends RegistedUser> U findUser(U u){
        HashMap<String, U> map = new HashMap<String, U>();
        map = FindAllUsers.findAllUsers(u);
        return (U) map.get(u.getUserID());
    }
    public static <U extends RegistedUser> U findUser(int userID, U u){
        HashMap<String, U> map = new HashMap<String, U>();
        map = FindAllUsers.findAllUsers(u);
        return (U) map.get(userID);
    }
    public static <U extends RegistedUser> U findUser (int userID, String pwd, U u){
        HashMap<Integer, U> map = new HashMap<Integer, U>();
        map = new FindAllUsers().findAllUsers(u);
        if (map.get(userID).getUserPassword().equals(pwd)) {
            return (U) map.get(userID);
        }
        else return null;
    }
}
