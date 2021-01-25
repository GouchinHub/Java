public class BottleDispenser {
    private int bottles;
    private int money;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if(money <= 0){
            System.out.println("Add money first!");
        }
        else if(bottles <= 0){
            System.out.println("No more bottles!");
        } else {
            bottles -= 1;
            money -= 1;
            System.out.println("KACHUNK! A bottle came out of the dispenser!");
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
