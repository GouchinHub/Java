import java.text.DecimalFormat;
import java.util.ArrayList;

public class BottleDispenser {
    ArrayList<Bottle> bottle_array = new ArrayList<Bottle>();
    private double money;
    
    public BottleDispenser() {
        money = 0;
        String name = "Pepsi Max";
        String manuf = "Pepsi";
        Double totE = 0.3;
        Double size = 0.5;
        Double cost = 1.80;
        Bottle newBottle = new Bottle(name,manuf,totE,size,cost);
        bottle_array.add(newBottle);
        newBottle = new Bottle(name,manuf,totE,1.5,2.2);
        bottle_array.add(newBottle);
        newBottle = new Bottle("Coca-Cola Zero","Coca-Cola",totE,size,2.0);
        bottle_array.add(newBottle);
        newBottle = new Bottle("Coca-Cola Zero","Coca-Cola",totE,1.5,2.5);
        bottle_array.add(newBottle);
        newBottle = new Bottle("Fanta Zero","Fanta",totE,size,1.95);
        bottle_array.add(newBottle);
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle(int choice) {
        try {
            bottle_array.get(choice-1);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Out of order!");
            return;
        }
        if(money < bottle_array.get(choice-1).getPrice()){
            System.out.println("Add money first!");
        } else {
            money -= bottle_array.get(choice-1).getPrice();
            System.out.println("KACHUNK! "+ bottle_array.get(choice-1).getName() +" came out of the dispenser!");
            bottle_array.remove(choice-1);
        }
    }
    
    public void returnMoney() {
        if(money == 0){
            System.out.println("Klink klink!! All money gone!");
        } else {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Klink klink. Money came out! You got "+ df.format(money) +"€ back");
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
