package operations;

import users.Librarian;
import users.RegistedUser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Rroks on 2016/11/26.
 */
public class FindAllUsers {
    FindAllUsers(){}

    public static <U extends RegistedUser> void printAllUsers(HashMap<Integer, U> map){
        Iterator iterator = map.keySet().iterator();
        U u;
        while (iterator.hasNext()){
            Object key = iterator.next();
            u = (U) map.get(key);
            String userInfo = u.getUserID() + "; " + u.borrowlisttostring();
            System.out.println(userInfo);
        }
    }
    public static <U extends RegistedUser> HashMap findAllUsers(U u) {
        HashMap<Integer, U> map = new HashMap<Integer, U>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(u.getFileName()));
            String rdline = "";
            while ((rdline = bufferedReader.readLine()) != null) {
                String[] field = rdline.split(";");
                u.setUserID(Integer.parseInt(field[0]));
                u.setUserPassword(field[1]);
                String[] bookList = field[field.length - 1].split(",");
                for (int i = 0; i < bookList.length; i++) {
                    u.setBorrow(bookList[i]);
                }
                map.put(u.getUserID(), u);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
//        try {
//            BufferedReader breader = new BufferedReader(new FileReader(userFileName));
//            String rdline = "";
//            while ((rdline = breader.readLine()) != null){
//                String[] field = rdline.split(";");
//                user.setUserID(Integer.parseInt(field[0]));
//                user.setUserPassword(field[1]);
//                System.out.println(field[0] + field[field.length-1]);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
