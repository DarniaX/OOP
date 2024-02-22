package factory;

public interface Product {
    public double GetPrice();
    public void SetPrice(double Price);
    default void ChangePrice(double Factor){
        this.SetPrice(this.GetPrice()*Factor);
    }
}
