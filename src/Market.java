import java.util.ArrayList;
import java.util.Scanner;


public class Market {
    private String marketName;
    ArrayList<HouseHoldItems> catalog = new ArrayList<HouseHoldItems>();

    

    public Market(String marketName) {
        this.marketName = marketName;
    }
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
    public String getMarketName() {
        return marketName;
    }

    public HouseHoldItems search(String itemNameToSearch, char type){
    
        for(HouseHoldItems item : catalog){
            if(type == 'm'){
                System.out.println("You choose material type.");
                return item; 
            }
            if (type == 'e') {
                System.out.println("You choose energy rating type.");
                return item;
            }
        }
        return null;
    }

    public HouseHoldItems listItems(char type){
        System.out.println("Please select item from list: ");
        int i = 1;
        for(HouseHoldItems item : catalog){
            if(type == 'm' && item instanceof Furniture){
                System.out.println(i + ". " + item.getItemName());
                i++;
            }
            else if(type == 'e' && item instanceof Appliances){
                System.out.println(i + ". " + item.getItemName());
                i++;
            }
        }

        int j = 1;
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        for (HouseHoldItems item : catalog) {
            if ((type == 'm' && item instanceof Furniture) || (type == 'e' && item instanceof Appliances)) {
                if (j == choice) {
                    return item;
                }
                j++;
            }
        }
        return null;
    }
 }


