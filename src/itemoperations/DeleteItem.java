package itemoperations;

import items.Item;

import java.util.HashMap;
import java.util.StringJoiner;

/**
 * Created by Rroks on 2016/11/26.
 */
public class DeleteItem {
    DeleteItem(){}
    public static  <I extends Item> void deleteItem(I item){
        HashMap<String, I> map = FindAllItems.findAllItems(item);
        map.remove(item.getItemName());
        SetItem.writeIntoFile(item, map);
    }
}
