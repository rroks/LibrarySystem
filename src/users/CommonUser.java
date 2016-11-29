package users;

/**
 * Created by Rroks on 2016/11/26.
 */
public class CommonUser extends RegistedUser {
    public static final int BORROW_LIMIT = 6;
    public CommonUser(){
        fileName = "commonuser";
        borrowLimit = BORROW_LIMIT;
        borrowList = new String[borrowLimit];
        initializeList();
    }
    public String infoToString(){
        String info;
        info = userID + ";" + userPassword + ";" + borrowlisttostring();
        return info;
    }
}
