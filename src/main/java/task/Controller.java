package task;

import task.classes.*;

public class Controller {
    public Controller() throws CustomerExc {
        Customer[] customers = new Customer[]{
                new Customer("Павел", 32),
                new Customer("Евгений", 31),
                new Customer("Алена", 30),
                new Customer("Кирилл", 17)
        };
        Product[] products = new Product[]{
                new Product("Мяч", 99.99, 15),
                new Product("Бутерброд", 249.99, 5),
                new Product("Стол", 14900.90, 3),
                new Product("Машина", 2500000.10, 2),
                new Product("Ракета", 1150000000.49, 1),
                new Product("Алкоголь", 250.50, 50)
        };
        Order[] orders = new Order[6];
        orders[0] = Controller.makePursh(customers, products, "Ракета", "Павел", 3);
        orders[1] = Controller.makePursh(customers, products, "Стол", "Евгений", 6);
        orders[2] = Controller.makePursh(customers, products, "Машина", "Алена", 1);
        orders[3] = Controller.makePursh(customers, products, "Стол", "Евгений", 3);
        orders[4] = Controller.makePursh(customers, products, "Дом", "Павел", 1);
        orders[4] = Controller.makePursh(customers, products, "Бутерброд", "Евгений", 10);

        for (Order order: orders) {
            System.out.println(order);
        }
    }
    private static Order makePursh(Customer[] customers, Product[] products, String getNameOfProduct, String name, int quantityOrder) throws CustomerExc{
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
                if (product.getQuantity() == 0 || quantityOrder > product.getQuantity())
                    throw new QuantityExc(getNameOfProduct, name, quantityOrder);
            } catch (QuantityExc e){
                System.out.println(e);
            }
            for (Customer i : customers) {
                if (i.getName().equals(name))
                    customer = i;
            }
            if (customer == null)
                throw new CustomerExc(name);
            order = new Order(customer, product, quantityOrder);
        }
        catch (ProductExc e){
            System.out.println(e);
        }
        return order;
    }
}
