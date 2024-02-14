package task.classes;

public class ProductExc extends Exception {
    public ProductExc(String nameOfProduct) {
        super("Нет такого товара: " + nameOfProduct);
    }
}
