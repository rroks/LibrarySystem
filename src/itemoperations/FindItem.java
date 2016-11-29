package itemoperations;

import items.Book;
import items.Item;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Rroks on 2016/11/26.
 */
//public class FindItem extends ItemOperation {
//    public FindItem(HashMap map){
//        super(map);
//    }
//    public <F extends Item> F findItem (String itemName){
//        return (F) map.get(itemName);
//    }
//}
public class FindItem {
    public FindItem(){}

    public static <F extends Item> F findItem (String itemName, F f){
        HashMap<String, F> map = new HashMap<String, F>();
        map = FindAllItems.findAllItems(f);
        return (F) map.get(itemName);
    }
    public static <K extends Item> void printItem(K item){
        String userInfo = item.getItemName() + "; " + item.getItemState();
        System.out.println(userInfo);
    }
}
