package factory;
import java.util.*;

public class TV implements Product, EnergyConsumer, Display{
    //Fields
    //Product
    private double Price;
    //EnergyConsumer
    private final double Voltage;
    private final double Current;
    //Display
    private final int VerticalResolution;
    private final int HorizontalResolution;
    private final int BitsPerPixel;
    private final int RefreshRate;
    private final String Brand;
    private final String Model;
    private final String DisplayTechnology;
    private final List<String> DisplayConnectors;

    //Methods


    public static class Builder {
        //Fields
        //Product
        private double Price = 0;
        //EnergyConsumer
        private double Voltage = 0;
        private double Current = 0;
        //Display
        //Required
        private final int VerticalResolution;
        private final int HorizontalResolution;
        //Optional
        private int BitsPerPixel = 0;
        private int RefreshRate = 0;
        private String Brand = "";
        private String Model = "";
        private String DisplayTechnology = "";
        private List<String> DisplayConnectors;
        
        //Methods
        public Builder(int HorizontalResolution, int VerticalResolution){
            this.HorizontalResolution = HorizontalResolution;
            this.VerticalResolution = VerticalResolution;
        }
        public Builder setBitsPerPixel(int BPP){
            this.BitsPerPixel = BPP;
            return this;
        }
        public Builder setRefreshRate(int RR){
            this.RefreshRate = RR;
            return this;
        }
        public Builder setBrand(String Brand){
            this.Brand = Brand;
            return this;
        }
        public Builder setModel(String Model){
            this.Model = Model;
            return this;
        }
        public Builder setDisplayTechnology(String DT){
            this.DisplayTechnology = DT;
            return this;
        }
        public Builder setDisplayConnectors(List<String> DC){
            this.DisplayConnectors = DC;
            return this;
        }
        public Builder addDisplayConnector(String DC){
            this.DisplayConnectors.add(DC);
            return this;
        }
        public Builder setVoltage(double Voltage){
            this.Voltage = Voltage;
            return this;
        }
        public Builder setCurrent(double Current){
            this.Current = Current;
            return this;
        }
        public Builder setPrice(double Price){
            this.Price = Price;
            return this;
        }
        public TV build(){
            return new TV(this);
        }
    }
    //Constructor
    private TV(Builder builder){
        //Fields
        //Product
        Price=builder.Price;
        //EnergyConsumer
        Voltage=builder.Voltage;
        Current=builder.Current;
        //Display
        VerticalResolution=builder.VerticalResolution;
        HorizontalResolution=builder.HorizontalResolution;
        BitsPerPixel=builder.BitsPerPixel;
        RefreshRate=builder.RefreshRate;
        Brand=builder.Brand;
        Model=builder.Model;
        DisplayTechnology=builder.DisplayTechnology;
        DisplayConnectors=builder.DisplayConnectors;
    } 
    //Product
    public void SetPrice(double Price) {
        this.Price = Price;
    }
    public double GetPrice(){
        return this.Price;
    }
    //EnergyConsumer
    public double GetVoltage(){
        return this.Voltage;
    }
    public double GetCurrent(){
        return this.Current;
    }
    //Display
    public int GetVerticalResolution(){
        return this.VerticalResolution;
    }
    public int GetHorizontalResolution(){
        return this.HorizontalResolution;
    }
    public int GetBitsPerPixel(){
        return this.BitsPerPixel;
    }
    public int GetRefreshRate(){
        return this.RefreshRate;
    }
    public String GetBrand(){
        return this.Brand;
    }
    public String GetModel(){
        return this.Model;
    }
    public String GetDisplayTechnology(){
        return this.DisplayTechnology;
    }
    public List<String> GetDisplayConnectors(){
        return this.DisplayConnectors;
    }

    @Override
    public String toString(){
        return String.format("$%-8.2f %s %s, %dx%dx%d@%dhz %s display %s %.0fV %.2fA (%.2fkWh)", Price, Brand, Model, HorizontalResolution, VerticalResolution, BitsPerPixel, RefreshRate, DisplayTechnology, DisplayConnectors, Voltage, Current, (GetPowerConsumption(Voltage, Current)/24));
    }

    @Override
    public void accept(ProductVisitor visitor){
        visitor.visit(this);
    }
}
