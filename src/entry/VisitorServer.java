package entry;

import itemoperations.FindAllItems;
import systemoperator.VisitorOperator;
import users.Visitor;
import items.*;

import java.util.Scanner;

/**
 * Created by Rroks on 2016/11/27.
 */
public class VisitorServer {
    public static void Start(){
        boolean vsFlag = true;
        while (vsFlag){
            System.out.println("1.All items");
            System.out.print("5.All books");
            System.out.println("2.Search an item");
            System.out.println("4.Seerch a book");
            System.out.println("3.Back");
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString){
                case "1":
                    VisitorOperator.findAll();
                    break;
                case "5":
                    VisitorOperator.findKind(new Book());
                    break;
                case "2":
                    String itemname = sc.nextLine();
                    VisitorOperator.searchItem(itemname);
                    break;
                case "4":
                    String bookname = sc.nextLine();
                    VisitorOperator.searchItem(bookname, new Book());
                    break;
                case "3":
                    vsFlag = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
