package entry;

import systemoperator.LibrarianOperator;
import users.Librarian;

import java.util.Scanner;

/**
 * Created by Rroks on 2016/11/27.
 */
public class LibrarianServer {
    public static void Start(Librarian librarian) {
        boolean lsFlag = true;
        while (lsFlag) {
            System.out.println("1.Add Item");
            System.out.print("5.exist");
            System.out.println("2.Delete");
            System.out.println("4.delete user");
            System.out.println("3.Add user");
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString) {
                case "1":
                    LibrarianOperator.addItem();
                    break;
                case "2":
                    LibrarianOperator.deleteItem();
                    break;
                case "3":
                    LibrarianOperator.addUser();
                    break;
                case "4":
                    LibrarianOperator.deleteUser();
                    break;
                case "5":
                    lsFlag = false;
                    break;
                default:
                    break;
            }
        }
    }
}