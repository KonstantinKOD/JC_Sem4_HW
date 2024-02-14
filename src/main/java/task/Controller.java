package task;

import task.classes.*;

public class Controller {
    public Controller() throws CustomerExc {
        Customer[] customers = new Customer[]{
                new Customer("Павел", 32),
                new Customer("Евгений", 31),
                new Customer("Алена", 30),
                new Customer("Иван", 17)
        };
        Product[] products = new Product[]{
                new Product("Мяч", 99.99),
                new Product("Бутерброд", 249.99),
                new Product("Стол", 14900.90),
                new Product("Машина", 2500000.10),
                new Product("Ракета", 1150000000.49),
                new Product("Алкоголь", 250.50)
        };
        Order[] orders = new Order[5];
        orders[0] = Controller.makePursh(customers, products, "Ракета", 2, "Павел");
        orders[1] = Controller.makePursh(customers, products, "Стол", 1, "Евгений");
        orders[2] = Controller.makePursh(customers, products, "Машина", 3, "Алена");
        orders[3] = Controller.makePursh(customers, products, "Стол", 5, "Евгений");
        orders[4] = Controller.makePursh(customers, products, "Дом", 1, "Павел");
        // order[5] создан специально для переполнения массива
        orders[5] = Controller.makePursh(customers, products, "Бутерброд", 101, "Евгений");

        for (Order order: orders) {
            System.out.println(order);
        }
    }
    private static Order makePursh(Customer[] customers, Product[] products, String getNameOfProduct, int quantity, String name) throws CustomerExc{
        Order order = null;
        Customer customer = null;
        Product product = null;
        try {
            for (Product i: products) {
                if (i.getNameOfProduct().equals(getNameOfProduct))
                    product = i;
            }
            if (product == null)
                throw new ProductExc(getNameOfProduct);
            try{
                if (quantity <= 0 || quantity >=100)
                    throw new QuantityExc(getNameOfProduct, name, quantity);
            } catch (QuantityExc e){
                System.out.println(e);
            }
            for (Customer i : customers) {
                if (i.getName().equals(name))
                    customer = i;
            }
            if (customer == null)
                throw new CustomerExc(name);
            order = new Order(customer, product, quantity);

        }
        catch (ProductExc e){
            System.out.println(e);
        }
        return order;
    }
}
