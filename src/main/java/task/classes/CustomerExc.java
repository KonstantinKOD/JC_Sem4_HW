package task.classes;

public class CustomerExc extends Exception {
    public CustomerExc(String name) {
        super("Не найден покупатель с именем" + name);
    }
}
