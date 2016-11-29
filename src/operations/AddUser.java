package operations;

import users.RegistedUser;
import users.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Rroks on 2016/11/26.
 */
public class AddUser {
    AddUser(){}
    public static  <U extends RegistedUser> void addUser(U u){
        HashMap<Integer, U> map = FindAllUsers.findAllUsers(u);
        map.putIfAbsent(u.getUserID(), u);
        SetUser.writeIntoFile(u, map);
    }
}
