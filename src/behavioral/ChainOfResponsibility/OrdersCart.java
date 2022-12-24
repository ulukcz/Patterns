package behavioral.ChainOfResponsibility;

public abstract class OrdersCart {
    private int countOrders;
    private OrdersCart nextOrdersCart;

    public OrdersCart(int levelOrders) {
        this.countOrders = levelOrders;
    }

    public void setNextOrdersCart(OrdersCart nextOrdersCart) {
        this.nextOrdersCart = nextOrdersCart;
    }

    public void orderManager(String message, int level) {
        if (level >= countOrders)
            write(message);
        if (nextOrdersCart != null) {
            nextOrdersCart.orderManager(message, level);
        }
    }

    public abstract void write(String message);
}
