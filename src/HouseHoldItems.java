public abstract class HouseHoldItems{
    protected String itemName;
    protected double price;

    


    public HouseHoldItems(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}