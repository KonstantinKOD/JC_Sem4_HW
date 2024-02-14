package task.classes;

public class QuantityExc extends Exception {
    public QuantityExc(String nameOfProduct, String name, int quantity) {
        super("Уважаемый покупатель " + name + ", товара " + nameOfProduct + " нет в количестве: " + quantity);
    }
}
