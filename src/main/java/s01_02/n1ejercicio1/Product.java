package s01_02.n1ejercicio1;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
