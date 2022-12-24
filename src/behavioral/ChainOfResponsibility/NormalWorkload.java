package behavioral.ChainOfResponsibility;

public class NormalWorkload extends OrdersCart{
    public NormalWorkload(int levelOrders) {
        super(levelOrders);
    }

    @Override
    public void write(String message) {
        System.out.println("Super Chef said: " + message);
    }
}
