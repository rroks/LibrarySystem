package itemoperations;

import items.Item;
import users.RegistedUser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Rroks on 2016/11/26.
 */
public class SetItem {
    SetItem(){}
    public static <S extends Item> void setItem(S s){
        HashMap<String, S> map = FindAllItems.findAllItems(s);
        map.put(s.getItemName(), s);
        writeIntoFile(s, map);
    }
    public static  <I extends Item> void writeIntoFile(I i, HashMap<String, I> map){
        try {
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(i.getFileName()));

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
