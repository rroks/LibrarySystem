package items;

/**
 * Created by Rroks on 2016/11/25.
 */
public class Book extends Item {
//    private String bookInfo = "A book";
    public Book(){
        fileName = "Book";
        itemType = ItemType.Book;
    }

    public void setBookInfo(){}
//    public String getBookInfo(){
//        return  bookInfo;
//    }
    public String infoToString(){
        String info;
        info = itemName + ";" + itemState + ";" + itemType;
        return info;
    }
}
