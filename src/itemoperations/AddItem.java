package itemoperations;

import items.Item;

import java.util.HashMap;

/**
 * Created by Rroks on 2016/11/26.
 */
public class AddItem {
    AddItem(){}
    public static <I extends Item> void addItem(I i){
        HashMap<String, I> map = FindAllItems.findAllItems(i);
        map.putIfAbsent(i.getItemName(), i);
        SetItem.writeIntoFile(i, map);
    }
}
