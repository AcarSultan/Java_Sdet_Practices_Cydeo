package candy;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;


    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0){
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0){
            this.price = price;
        }
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }


    @Override
    public String toString() {
        return "Candy{" +
                "brand= '" + brand + '\'' +
                ", quantity= " + quantity +
                ", price= " + (price == 0 ? "FREE" : price) +
                ", hasPeanuts= " + hasPeanuts +
                '}';
    }
}
