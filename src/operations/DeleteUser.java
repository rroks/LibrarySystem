package operations;

import itemoperations.DeleteItem;
import itemoperations.FindAllItems;
import users.RegistedUser;

import java.util.HashMap;

/**
 * Created by Rroks on 2016/11/26.
 */
public class DeleteUser {
    DeleteUser(){}
    public static <U extends RegistedUser> void deleteUser(int userID, U user){
        HashMap<Integer, U> map = FindAllUsers.findAllUsers(user);
        map.remove(userID);
        SetUser.writeIntoFile(user, map);
    }
}
