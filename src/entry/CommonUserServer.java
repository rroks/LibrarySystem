package entry;

import java.util.Scanner;

import itemoperations.FindItem;
import itemoperations.SetItem;
import items.Book;
import items.Item;
import operations.*;
import systemoperator.CommonOperator;
import users.CommonUser;
import users.RegistedUser;
import users.Visitor;

/**
 * Created by Rroks on 2016/11/27.
 */
public class CommonUserServer {
    public static void Start(CommonUser user){
        boolean csFlag = true;
        while (csFlag){
            System.out.println("1.Borrow");
            System.out.println("2.Borrow a book");
            System.out.println("3.Return");
            System.out.println("4.Exist");
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString){
                case "1":
                    break;
                case "2":
                    CommonOperator.userBorrow(user, new Book());
                    break;
                case "3":
                    CommonOperator.userReturn(user);
                    break;
                case "4":
                    csFlag = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
