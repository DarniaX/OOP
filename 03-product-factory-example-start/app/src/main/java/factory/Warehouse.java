package factory;

import java.util.List;
import java.util.ArrayList;

public class Warehouse {
    private String name;
    private List<Product> products;

    public Warehouse(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public static Warehouse createMyWarehouse() {
        List<Product> products = new ArrayList<>();

        // TODO add products

        return new Warehouse("My warehouse", products);
    }

    public void procedure1() {
        // TODO implement
    }

    public void procedure2() {
        // TODO implement
    }

    @Override
    public String toString() {
        // TODO implement

        return "";
    }
}
