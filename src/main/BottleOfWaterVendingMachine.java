package main;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {

    private final List<Product> products;

    private int money;

    public BottleOfWaterVendingMachine(List<Product> products) {

        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    public BottleOfWater getProduct(String name, int volume){
        for(Product product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }

        }
        return null;
    }
}
