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
public class SetUser {
    SetUser(){}
    public static <U extends RegistedUser> void setUser(U u){
        HashMap<Integer, U> map = new HashMap<Integer, U>();
        map.put(u.getUserID(), u);
        writeIntoFile(u, map);
    }
    public static  <U extends RegistedUser> void writeIntoFile(U u, HashMap<Integer, U> map){
        try {
            BufferedWriter bwriter =  new BufferedWriter(new FileWriter(u.getFileName()));

            for (Object o : map.keySet()) {
                bwriter.write(map.get(o).infoToString());
                bwriter.newLine();
            }
            bwriter.flush();
            bwriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
