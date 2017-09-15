package oop.week2.homework.project_2_1_centre_mvc.model;

/**
 * Created by Poosh on 13.09.2017.
 */
public class Product {

    private double price;
    private String model;
    private boolean fixed;

    public Product(double price, String model, boolean fixed) {
        this.price = price;
        this.model = model;
        this.fixed = fixed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", fixed=" + fixed +
                '}';
    }

}
