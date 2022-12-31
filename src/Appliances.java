public class Appliances extends HouseHoldItems {
    private char energyRating;

    

    public Appliances(String itemName, double price, char energyRating) {
        super(itemName, price);
        this.energyRating = energyRating;
    }
    public void setEnergyRating(char energyRating) {
        this.energyRating = energyRating;
    }
    public char getEnergyRating() {
        return energyRating;
    }
}
