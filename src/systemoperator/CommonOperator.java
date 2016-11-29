package systemoperator;

import itemoperations.FindItem;
import itemoperations.SetItem;
import items.Book;
import items.Item;
import users.CommonUser;
import users.RegistedUser;

import java.util.Scanner;

/**
 * Created by Rroks on 2016/11/27.
 */
public class CommonOperator extends VisitorOperator{
    private CommonUser user =new CommonUser();
    public CommonOperator(){
    }
    public void logIn(int userID, String pwd){}
    public <I extends Item> void borrowItem(){}
    public <I extends Item> void returnItem(){}
    public static <I extends Item> void borrow(String itemname, I i){
        I item;
        if ((item = FindItem.findItem(itemname, i)) == null){
            System.out.println("NOT EXIST");
        } else {
            if (item.getItemState()){
                item.setItemState(false);
                SetItem.setItem(item);
            }
            else {
                System.out.println("Not avaliable");
            }
        }
    }
    public static <U extends RegistedUser, I extends Item> void userBorrow(U u, I i){
        if (u.borrowFlag()) {
            System.out.println("Enter item name");
            String itemname = new Scanner(System.in).nextLine();
            u.setBorrow(itemname);
            borrow(itemname, i);
        } else System.out.println("List is full");

    }
    public static <U extends RegistedUser, I extends Item> void userReturn(U u){
        System.out.println(u.borrowlisttostring());
        System.out.println("Enter item name");
        String itemname = new Scanner(System.in).nextLine();
        I item = (I) FindItem.findItem(itemname, new Book());
        for (int j = 0; j < u.getBorrowList().length; j++){
            if (u.getBorrowList()[j].equals(itemname)){
                u.setReturn(itemname);
                returnItem(item);
                break;
            }
        }
    }
    public static <I extends Item> void returnItem(I i){
        i.setItemState(true);
        SetItem.setItem(i);
    }
}
