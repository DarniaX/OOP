package factory;
import java.util.*;

public class TV implements Product, EnergyConsumer, Display{
    //Fields
    //Product
    private double Price;
    //EnergyConsumer
    private double Voltage;
    private double Current;
    //Display
    private int VerticalResolution;
    private int HorizontalResolution;
    private int BitsPerPixel;
    private int RefreshRate;
    private String Brand;
    private String Model;
    private String DisplayTechnology;
    private List<String> DisplayConnectors;

    //Methods
    //Constructor
    private TV(TVBuilder builder){
        //Fields
        //Product
        this.Price=builder.Price;
        //EnergyConsumer
        this.Voltage=builder.Voltage;
        this.Current=builder.Current;
        //Display
        this.VerticalResolution=builder.VerticalResolution;
        this.HorizontalResolution=builder.HorizontalResolution;
        this.BitsPerPixel=builder.BitsPerPixel;
        this.RefreshRate=builder.RefreshRate;
        this.Brand=builder.Brand;
        this.Model=builder.Model;
        this.DisplayTechnology=builder.DisplayTechnology;
        this.DisplayConnectors=builder.DisplayConnectors;
    }
    public class TVBuilder {
        //Fields
        //Product
        private double Price;
        //EnergyConsumer
        private double Voltage;
        private double Current;
        //Display
        //Required
        private int VerticalResolution;
        private int HorizontalResolution;
        //Optional
        private int BitsPerPixel;
        private int RefreshRate;
        private String Brand;
        private String Model;
        private String DisplayTechnology;
        private List<String> DisplayConnectors;
        
        //Methods
        public TVBuilder(int HorizontalResolution, int VerticalResolution){
            this.HorizontalResolution = HorizontalResolution;
            this.VerticalResolution = VerticalResolution;
        }
        public TVBuilder setBitsPerPixel(int BPP){
            this.BitsPerPixel = BPP;
            return this;
        }
        public TVBuilder setRefreshRate(int RR){
            this.RefreshRate = RR;
            return this;
        }
        public TVBuilder setBrand(String Brand){
            this.Brand = Brand;
            return this;
        }
        public TVBuilder setModel(String Model){
            this.Model = Model;
            return this;
        }
        public TVBuilder setDisplayTechnology(String DT){
            this.DisplayTechnology = DT;
            return this;
        }
        public TVBuilder setDisplayConnectors(List<String> DC){
            this.DisplayConnectors = DC;
            return this;
        }
        public TVBuilder addDisplayConnector(String DC){
            this.DisplayConnectors.add(DC);
            return this;
            
        }
        public TV build(){
            return new TV(this);
        }
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

}
