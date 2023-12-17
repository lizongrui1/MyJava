package arraylistdemo;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String band, int price) {
        this.brand = band;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
