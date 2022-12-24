package structural.Facade;

public class WorkFlow {
    Cook cook = new Cook();
    Order order = new Order();
    Prepare prepare = new Prepare();

    public void doOrder() {
        order.yesOrder();
        cook.doingKebab();
        prepare.prepare(order);
    }
}
