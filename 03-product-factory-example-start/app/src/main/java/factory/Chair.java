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

    @Override
    public String toString(){
        return String.format("$%-8.2f %s chair", Price, Material);
    }

    @Override
    public void accept(ProductVisitor visitor){
        visitor.visit(this);
    }
}
