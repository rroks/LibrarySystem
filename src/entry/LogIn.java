package entry;

import operations.FindUser;
import users.CommonUser;
import users.Librarian;
import users.RegistedUser;
import operations.*;

import java.util.Scanner;

/**
 * Created by Rroks on 2016/11/27.
 */
public class LogIn {
    public static void Logger(){
        boolean loggerFlag = true;
        while (loggerFlag){
            System.out.println("1.Browse as a Vistor");
            System.out.println("2.Common user");
            System.out.println("3.Librarian");
            System.out.println("4.Exist");
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString){
                case "1":
                    VisitorServer.Start();
                    break;
                case "2":
                    int userID = Integer.parseInt(sc.nextLine());
                    String pwd = sc.nextLine();
                    CommonUser commonUser = new CommonUser();
                    if ((commonUser = logInChecker(userID, pwd, new CommonUser())) != null) {
                        CommonUserServer.Start(commonUser);
                    }
                    break;
                case "3":
                    System.out.print("ID");
                    int librarianID = Integer.parseInt(sc.nextLine());
                    System.out.print("pwd");
                    String lpwd = sc.nextLine();
                    Librarian librarian = new Librarian();
                    if ((librarian = logInChecker(librarianID, lpwd, new Librarian())) != null) {
                        LibrarianServer.Start(librarian);
                    }
                    break;
                case "4":
                    loggerFlag = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

        }
    }
    public static <U extends RegistedUser> U logInChecker(int userID, String pwd, U u){
        U user;
        if ((user = FindUser.findUser(userID, pwd, u)) != null){
            if (user.getUserPassword().equals(pwd)){
                return user;
            }
        }
        return null;
    }
}
