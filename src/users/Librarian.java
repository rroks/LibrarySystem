package users;

/**
 * Created by Rroks on 2016/11/25.
 */
public class Librarian extends RegistedUser {
    private static final int BORROW_LIMIT = 20;
    public Librarian(){
        fileName = "librarian";
        borrowLimit = BORROW_LIMIT;
        borrowList = new String[borrowLimit];
        initializeList();
    }
}
