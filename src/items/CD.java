package items;

/**
 * Created by Rroks on 2016/11/25.
 */
public class CD extends Item {
    private String cdInfo;
    public CD(){
        fileName = "CD";
        itemType = ItemType.CD;
    }

    public void setCdInfo(){}
    public String getCdInfo(){
        return "";
    }
}
