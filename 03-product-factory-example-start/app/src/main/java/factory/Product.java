package factory;

public interface Product {
    double GetPrice();
    void SetPrice(double Price);
    default void ChangePrice(double Factor){
        this.SetPrice(this.GetPrice()*Factor);
    }
    void accept(ProductVisitor visitor);
}
