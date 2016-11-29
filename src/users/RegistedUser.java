package users;

/**
 * Created by Rroks on 2016/11/25.
 */
abstract public class RegistedUser extends User {
    public int borrowLimit;
    protected String[] borrowList = new String[borrowLimit];
    protected String fileName;
    RegistedUser(){
    }

    public void setBorrowLimit(int borrowLimit){
        this.borrowLimit = borrowLimit;
    }
    public void setBorrow(String boitem){
        for (int i = 0; i < borrowLimit; i++){
            if (getBorrowList()[i].equals("")){
                borrowList[i] = boitem;
                break;
            }
        }
    }
    public void setReturn(String reitem){
        for (int i = 0; i < borrowLimit; i++){
            if (getBorrowList()[i].equals(reitem)){
                borrowList[i] = "";
                break;
            }
        }
    }
    public boolean borrowFlag(){
        for (int i = 0; i < borrowLimit; i++){
            if (getBorrowList()[i].equals("")){
                return true;
            }
        }
        return false;
    }
    public boolean listEmpty(){
        for (int i = 0; i < borrowLimit; i++){
            if (!getBorrowList()[i].equals("")){
                return false;
            }
        }
        return true;
    }
    public String[] getBorrowList(){
        return borrowList;
    }
    public String borrowlisttostring() {
        //loop
        String str = "";
        for (int i = 1; i < borrowLimit; i++) {
            str += borrowList[i-1] + ",";
        }
        str += borrowList[borrowLimit-1];
        return str;
    }
    public String getFileName(){
        return fileName;
    }
    public String infoToString(){
        String info;
        info = userID + ";" + userPassword + ";" + borrowlisttostring();
        return info;
    }
    protected void initializeList(){
        for (int i = 0; i < borrowLimit; i++){
            borrowList[i] = "";
        }
    }
}
