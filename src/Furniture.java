public class Furniture extends HouseHoldItems{
    private String material;

    

    public Furniture(String itemName, double price, String material) {
        super(itemName, price);
        this.material = material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    
}
