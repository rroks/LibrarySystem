package operations;

import users.Librarian;
import users.RegistedUser;
import users.User;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rroks on 2016/11/26.
 */
public class UserOperation<U extends RegistedUser> {
    public U user = null;
//    protected String userFileName = user.getFileName();
//    Set<U> set = new HashSet<U>();
//    Map map = new HashMap<Integer, U>();
    HashMap map;

    UserOperation(){}

    UserOperation(HashMap<Integer, U> map){
//        this.map.putAll(map);
        this.map = map;
    }

//    public void writeIntoMap(){
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(userFileName));
//            String rdline = "";
//            while ((rdline = bufferedReader.readLine()) != null){
//                String[] field = rdline.split(";");
//                user.setUserID(Integer.parseInt(field[0]));
//                user.setUserPassword(field[1]);
//                String[] bookList = field[field.length-1].split(",");
//                for (int i = 0; i < bookList.length; i++){
//                    user.setBorrow(bookList[i]);
//                }
//                map.put(user.getUserID(), user);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
