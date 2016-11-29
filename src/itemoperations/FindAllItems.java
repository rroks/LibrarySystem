package itemoperations;

import items.Item;
import operations.FindAllUsers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Rroks on 2016/11/26.
 */
public class FindAllItems {

    public FindAllItems(){}

    public static <F extends Item> void printAllItems(HashMap<String, F> map){
        Iterator iterator = map.keySet().iterator();
        F itemf;
        while (iterator.hasNext()){
            Object key = iterator.next();
            itemf = (F) map.get(key);
            String userInfo = itemf.getItemName() + "; " + itemf.getItemState();
            System.out.println(userInfo);
        }
    }
    public static <K extends Item> HashMap findAllItems(K k) {
        HashMap<String, K> map = new HashMap<String, K>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(k.getFileName()));
            String rdline = "";
            while ((rdline = bufferedReader.readLine()) != null) {
                String[] field = rdline.split(";");
                k.setItemName(field[0]);
                k.setItemState(Boolean.parseBoolean(field[1]));
                k.setItemType(field[2]);
                map.put(k.getItemName(), k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
