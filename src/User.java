import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
public class User {
    private String userName, cardNumber, address;
    ArrayList<HouseHoldItems> shoppingCard = new ArrayList<HouseHoldItems>();

    


    public User(String userName, String cardNumber, String address) {
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.address = address;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void connect(Market m){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter item name: ");
        String tempItemName = scan.nextLine();
        System.out.println("Please determine the type: ");
        char tempType = scan.next().charAt(0);

        m.search(tempItemName, tempType);
        shoppingCard.add(m.listItems(tempType));
    }

    public void calculate(){
        double total = 0.0;
        for(HouseHoldItems item: shoppingCard){
            total += item.getPrice();
        }
        System.out.println("Total price: " + total);
    }
    
    
}
