package task.classes;

public class Order {
    private Customer customer;
    private Product product;
    private static int quantityOrder;

    public Order(Customer customer, Product product, int quantityOrder) {
        this.customer = customer;
        this.product = product;
        this.quantityOrder = quantityOrder;
    }

    public static int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return String.format("%s %s", customer, product);
    }
}
