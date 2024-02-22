package factory;

public class Fridge implements Product, EnergyConsumer {
    //Fields
    private double Price;
    private boolean HasFreezer;
    private int Volume;
    private String Brand;
    private double Voltage;
    private double Current;

    //Methods
    //Constructors
    private Fridge(double Price, boolean HasFreezer, int Volume, String Brand, double Voltage, double Current){
        this.Price = Price;
        this.HasFreezer = HasFreezer;
        this.Volume = Volume;
        this.Brand = Brand;
        this.Voltage = Voltage;
        this.Current = Current;
    }
    static Fridge createFreezer(String Brand, int Volume, double Price){
        return new Fridge(Price, true, Volume, Brand, 240, 2);
    }
    static Fridge createFridge(String Brand, int Volume, double Price){
        return new Fridge(Price, false, Volume, Brand, 240, 2);
    }

    //Object interface
    public double GetPrice(){
        return this.Price;
    }
    public void SetPrice(double Price){
        this.Price = Price;
    }
    
    //EnergyConsumer interface
    public double GetVoltage(){
        return Voltage;
    }
    public double GetCurrent(){
        return Current;
    }

    //Methods
    public boolean HasFreezer(){
        return HasFreezer;
    }
    public int GetVolume(){
        return Volume;
    }
    public String GetBrand(){
        return Brand;
    }

    @Override
    public String toString(){
        String freezer = "with";
        if (!HasFreezer)
            freezer += "out";
        return String.format("$%-8.2f %s %d fridge %s freezer %.0fV %.2fA (%.2fkWh)", Price, Brand, Volume, freezer, Voltage, Current, GetPowerConsumption(Voltage, Current));
    }

    @Override
    public void accept(ProductVisitor visitor){
        visitor.visit(this);
    }
}
