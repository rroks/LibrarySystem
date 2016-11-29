package systemoperator;

import itemoperations.AddItem;
import itemoperations.DeleteItem;
import itemoperations.FindAllItems;
import itemoperations.FindItem;
import items.Book;
import items.Item;
import operations.AddUser;
import operations.DeleteUser;
import operations.FindAllUsers;
import operations.FindUser;
import users.CommonUser;
import users.RegistedUser;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Rroks on 2016/11/27.
 */
public class LibrarianOperator extends CommonOperator {
    public static void deleteUser(){
        FindAllUsers.printAllUsers(FindAllUsers.findAllUsers(new CommonUser()));
        System.out.println("Enter userID nunmber");
        int userID = new Scanner(System.in).nextInt();
        if (FindUser.findUser(userID, new CommonUser()) != null
                && FindUser.findUser(userID, new CommonUser()).listEmpty()) {
            DeleteUser.deleteUser(userID, new CommonUser());
            System.out.println("Deleted sucessfully");
        }
        else if (FindUser.findUser(userID, new CommonUser()) == null){
            System.out.println("User not exist");
        }
        else if (!FindUser.findUser(userID, new CommonUser()).listEmpty()){
            System.out.println("Must return all item(s)");
        }

    }
    public static void addUser(){
        CommonUser newUser = new CommonUser();
        while (true) {
            System.out.println("Enter userID nunmber");
            int userID = Integer.parseInt(new Scanner(System.in).nextLine());
            if (FindUser.findUser(userID, new CommonUser()) != null) {
                System.out.println("Wrong userID");
            } else {
                newUser.setUserID(userID);
                break;
            }
        }

        while (true) {
            System.out.println("Enter password");
            String pwd = new Scanner(System.in).nextLine();
            if (pwd.equals("")){
                System.out.print("Password should not be empty");
            } else {
                newUser.setUserPassword(pwd);
                break;
            }
        }
        AddUser.addUser(newUser);
    }
    public static void addItem(){
        Book book = new Book();
        while (true) {
            System.out.println("Enter book name");
            String bookname = new Scanner(System.in).nextLine();
            if (FindItem.findItem(bookname, new Book()) != null) {
                System.out.println("Wrong userID");
            } else {
                book.setItemName(bookname);
                break;
            }
        }

        AddItem.addItem(book);
    }
    public static <I extends Item> void deleteItem(){
        VisitorOperator.findAll();
        System.out.println("Enter an item name");
        String itemname = new Scanner(System.in).nextLine();
        if (FindItem.findItem(itemname, new Book()) != null
                && FindItem.findItem(itemname, new Book()).getItemState()) {
            DeleteItem.deleteItem(FindItem.findItem(itemname, new Book()));
            System.out.println("Deleted sucessfully");
        } else {
            if (FindItem.findItem(itemname, new Book()) == null){
                System.out.println("User not exist");
            }
            if (!FindItem.findItem(itemname, new Book()).getItemState()){
                System.out.println("Must return all item(s)");
            }
        }
    }
}
