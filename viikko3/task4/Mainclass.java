import  java.util.Scanner;

public class Mainclass {
    public static void main(String[] args){

        BottleDispenser dispenser = new BottleDispenser();
        int flag = 1;
        int choice = 0;
        while(flag == 1){
            System.out.println("\n*** BOTTLE DISPENSER ***");
            System.out.println("1) Add money to the machine");
            System.out.println("2) Buy a bottle");
            System.out.println("3) Take money out");
            System.out.println("4) List bottles in the dispenser");
            System.out.println("0) End");
            System.out.print("Your choice: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            try {
                choice = Integer.parseInt(input.trim());
            } catch (NumberFormatException nfeException) {
                System.out.println("Invalid input!!");
                System.exit(1);
            }
            switch(choice) {
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    dispenser.addMoney();
                    break;
                case 2:
                    dispenser.buyBottle();
                    break;
                case 3:
                    dispenser.returnMoney();
                    break;
                case 4:
                    dispenser.listBottles();
                    break;
                default:
                    
            }

        }
    }
}
