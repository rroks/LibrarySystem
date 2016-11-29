package items;

/**
 * Created by Rroks on 2016/11/25.
 */
abstract public class Item {
    protected String itemName;
    protected boolean itemState = true;
//    private String itemType;
    protected String fileName = "";

    protected ItemType itemType = null;

    enum ItemType{
        Book("book"), CD("cd"), DVD("dvd"), BlueRay("blueray");
        private String typename;

        ItemType(String typename) {
            this.typename = typename;
        }

        public String colorname(){
            return typename;
        }
    }
    Item(){}

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }

    public void setItemState(boolean flag){
        itemState = flag;
    }
    public boolean getItemState(){
        return itemState;
    }

    public void setItemType(String type){
        for (ItemType itemtype: ItemType.values()){
            if (type.equalsIgnoreCase(itemtype.toString())){
                itemType = itemtype;
            }
        }
    }
    public String getFileName(){
        return fileName;
    }
    public ItemType getItemType(){
        return itemType;
    }
    public String infoToString(){
        return null;
    }
//    public void setInfo(String info){
//        bookInfo = info;
//    }
}
