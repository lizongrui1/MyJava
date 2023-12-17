package objectoriented.Test8;

public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, int prive, String color) {
        this.brand = brand;
        this.price = prive;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
