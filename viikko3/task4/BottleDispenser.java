import java.util.ArrayList;

public class BottleDispenser {
    private int bottles;
    ArrayList<Bottle> bottle_array = new ArrayList<Bottle>();
    private double money;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
        String name = "Pepsi Max";
        String manuf = "Pepsi";
        Double totE = 0.3;
        Double size = 0.5;
        Double cost = 1.80;
        for(int i = 0;i<bottles;i++) {
            Bottle newBottle = new Bottle(name,manuf,totE,size,cost);
            bottle_array.add(newBottle);
        }
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if(money < bottle_array.get(bottles-1).getPrice()){
            System.out.println("Add money first!");
        }
        else if(bottles <= 0){
            System.out.println("No more bottles!");
        } else {
            money -= bottle_array.get(bottles-1).getPrice();
            System.out.println("KACHUNK! "+ bottle_array.get(bottles-1).getName() +" came out of the dispenser!");
            bottle_array.remove(bottles-1);
            bottles --;
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

    public void listBottles() {
        int i = 0;
        for (Bottle bottle : bottle_array) {
            i++;
            System.out.println(i+". Name: " +bottle.getName());
            System.out.println("\tSize: " +bottle.getSize() +"\tPrice: "+bottle.getPrice());
        }
    }
}
