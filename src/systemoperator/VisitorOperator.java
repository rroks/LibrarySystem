package systemoperator;

import itemoperations.FindAllItems;
import itemoperations.FindItem;
import items.*;
import users.Visitor;

import java.util.HashMap;

/**
 * Created by Rroks on 2016/11/27.
 */
public class VisitorOperator {
    private Visitor visitor = new Visitor();
    public VisitorOperator(){
    }
    public static void searchItem(String itemName){

        Book book = new Book();
        book.setItemName(itemName);
        CD cd = new CD();
        cd.setItemName(itemName);
        DVD dvd = new DVD();
        dvd.setItemName(itemName);

        FindItem finditem = new FindItem();
        if ((book = finditem.findItem(itemName, book)) != null){
            finditem.printItem(book);
        }
        if ((finditem.findItem(itemName, cd)) != null){
            finditem.printItem(cd);
        }
        if ((dvd = finditem.findItem(itemName, dvd)) != null){
            finditem.printItem(dvd);
        }
    }
    public static <K extends Item> void searchItem(String itemName, K k){
        FindItem finditem = new FindItem();
        if ((k = finditem.findItem(itemName, k)) != null){
            finditem.printItem(k);
        }
    }
    public static void findAll(){
        Book book = new Book();
        CD cd = new CD();
        DVD dvd = new DVD();
        FindAllItems.printAllItems(FindAllItems.findAllItems(book));
        FindAllItems.printAllItems(FindAllItems.findAllItems(cd));
        FindAllItems.printAllItems(FindAllItems.findAllItems(dvd));
    }
    public static <K extends Item> void findKind(K k){
        FindAllItems.findAllItems(k);//Map
        FindAllItems.printAllItems(FindAllItems.findAllItems(k));//printout
    }
}
