package itemoperations;

import items.Item;

import java.util.HashMap;

/**
 * Created by Rroks on 2016/11/26.
 */
public class ItemOperation<I extends Item> {
    protected I item;
    HashMap<String, I> map = new HashMap<String, I>();
    ItemOperation(HashMap<String, I> map){
        this.map = map;
    }
}
