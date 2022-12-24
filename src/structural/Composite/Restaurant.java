package structural.Composite;

public class Restaurant {
    public static void main(String[] args) {
        Order order = new Order();

        Kebab durum1 = new DurumKebab();
        Kebab doner1 = new DonerKebab();
        Kebab durum2 = new DurumKebab();
        Kebab doner2 = new DonerKebab();
        order.addKebab(durum1);
        order.addKebab(doner2);
        order.addKebab(durum2);
        order.addKebab(doner1);

        order.createOrder();
    }

}
