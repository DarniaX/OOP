package factory;

import java.util.List;


import java.util.ArrayList;
import java.util.Arrays;

public class Warehouse {
    private String name;
    private List<Product> products;

    public Warehouse(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public static Warehouse createMyWarehouse() {
        List<Product> products = new ArrayList<>();

        //Chairs
        products.add(new Chair(50, "wooden"));
        products.add(new Chair(100, "metal"));
        
        //TV's
        List<String> dc1 = Arrays.asList("HDMI", "HDMI", "DP");
        List<String> dc2 = Arrays.asList("HDMI", "HDMI", "DP", "DP");

        TV.Builder builder = new TV.Builder(1920, 1080);
        products.add(builder.setPrice(300).setBrand("LG").setModel("L27LCD+").setBitsPerPixel(24).setRefreshRate(60).setDisplayTechnology("LCD").setDisplayConnectors(dc1).setVoltage(240).setCurrent(0.10).build());
        products.add(builder.build());
        products.add(builder.setPrice(500).setBrand("Sony").setModel("S33IPS++").setRefreshRate(90).setDisplayTechnology("IPS").setDisplayConnectors(dc2).build());
        //Fridges
        products.add(Fridge.createFreezer("Bosch", 601, 400));
        products.add(Fridge.createFridge("Samsung", 1001, 600));
        return new Warehouse("My warehouse", products);
    }

    public void procedure1() {
        for (int i = 0; i < products.size(); i++){
            if (products.get(i) instanceof TV){
                if (((TV)products.get(i)).GetDisplayTechnology().equals("LCD"))
                    products.get(i).ChangePrice(0.90);
            }
            if (products.get(i) instanceof Fridge){
                if (((Fridge)products.get(i)).HasFreezer())
                    products.get(i).ChangePrice(1.20);
            }
        } 
    }

    public void procedure2() {
        Visitor visitor = new Visitor();
        for (Product p : products){
            p.accept(visitor);
        }
    }

    @Override
    public String toString() {

        String body = "";
        for (int i = 0; i < products.size(); i++){
            body += i + ":" + '\t' + products.get(i) + '\n';
        }

        return "Warehouse '" + name + "'" + '\n' + "Products: " + '\n' + body;
    }
}
