package behavioral.ChainOfResponsibility;

public class Restaurant {

    public static void main(String[] args) {
        OrdersCart orders = new Workload(OrdersThreshold.LOW);
        OrdersCart normOrders = new NormalWorkload(OrdersThreshold.NORMAL);
        OrdersCart manyOrders = new HighWorkload(OrdersThreshold.MANY);

        orders.setNextOrdersCart(normOrders);
        normOrders.setNextOrdersCart(manyOrders);

        orders.orderManager("Easy day, just relax boys", OrdersThreshold.LOW);
        orders.orderManager("We must work normal", OrdersThreshold.NORMAL);
        orders.orderManager("We must be faster, Don't get distracted", OrdersThreshold.MANY);
    }
}
