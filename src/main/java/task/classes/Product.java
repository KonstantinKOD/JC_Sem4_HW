package task.classes;

public class Product {
    private String nameOfProduct;
    private double price;
    private int quantity;

    public Product(String nameOfProduct, double price, int quantity) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " Купленый товар{" + nameOfProduct +
                ", по цене = " + price +
                ", в количестве = " + quantity +
                '}';
    }
}
