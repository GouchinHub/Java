
public class BottleDispenser {
    private int bottles;
    // The array for the Bottle-objects
    private Bottle[] bottle_array;
    private int money;
    
    public BottleDispenser() {
        bottles = 50;
        money = 0;
        String name = "Pepsi Max";
        String manuf = "Pepsi";
        Double totE = 0.3;
        Double size = 0.5;
        Double cost = 1.80;
        // Initialize the array
        bottle_array = new Bottle[bottles];
        // Add Bottle-objects to the array
        for(int i = 0;i<bottles;i++) {
            // Use the default constructor to create new Bottles
            bottle_array[i] = new Bottle(name,manuf,totE,size,cost);
        }
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if(money < bottle_array[bottles-1].getPrice()){
            System.out.println("Add money first!");
        }
        else if(bottles <= 0){
            System.out.println("No more bottles!");
        } else {
            money -= bottle_array[bottles-1].getPrice();
            System.out.println("KACHUNK! "+ bottle_array[bottles-1].getName() +" came out of the dispenser!");
            bottles -= 1;
        }
    }
    
    public void returnMoney() {
        if(money == 0){
            System.out.println("Klink klink!! All money gone!");
        } else {
            System.out.println("Klink klink. Money came out!");
            money = 0;
        }
    }
}
