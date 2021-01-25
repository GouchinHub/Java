public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    public Bottle(String name1, String manuf, double totE){
        name = name1;
        manufacturer = manuf;
        total_energy = totE;
    }
    public String getName(){
        return name;
    }

    public String getManufacturer(){
        return manufacturer;

    }
    public double getEnergy(){
        return total_energy;
    }
}