package behavioral.ChainOfResponsibility;

public class HighWorkload extends OrdersCart{
    public HighWorkload(int levelOrders) {
        super(levelOrders);
    }

    @Override
    public void write(String message) {
        System.out.println("Owner yelling: " + message);
    }
}
