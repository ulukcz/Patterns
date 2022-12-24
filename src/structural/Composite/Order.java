package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Kebab> orders = new ArrayList<>();

    void addKebab(Kebab kebab) {
        orders.add(kebab);
    }
    void removeKebab(Kebab kebab) {
        orders.remove(kebab);
    }
    void createOrder() {
        System.out.println("Creating your order");
        for (Kebab order:
             orders) {
            order.createKebab();
        }
        System.out.println("You order is ready!");
    }
}
