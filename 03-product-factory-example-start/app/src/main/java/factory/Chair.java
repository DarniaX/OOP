package factory;

public class Chair implements Product{ 
    private double Price;
    private String Material;

    public Chair(double StartPrice, String StartMaterial){
        this.Price = StartPrice;
        this.Material = StartMaterial;
    }

    public double GetPrice(){
        return this.Price;
    }
    public void SetPrice(double NewPrice){
        this.Price = NewPrice;
    }
    public String GetMaterial(){
        return this.Material;
    }

}
