public class App {
    public static void main(String[] args) throws Exception {
       Appliances item1 = new Appliances("app1", 10.0, 'A');
       Appliances item2 = new Appliances("app2", 20.0, 'B');
       Appliances item3 = new Appliances("app3", 30.0, 'C');

       Furniture item4 = new Furniture("furn1", 10.5, "wood");
       Furniture item5 = new Furniture("furn2", 20.5, "iron");
       Furniture item6 = new Furniture("furn3", 30.5, "dark wood");

       Market market = new Market("Market1");
       market.catalog.add(item1);
       market.catalog.add(item2);
       market.catalog.add(item3);
       market.catalog.add(item4);
       market.catalog.add(item5);
       market.catalog.add(item6);

       User me = new User("Ozan", "123", "Foca");
       me.connect(market);
       me.calculate();

    }
}
