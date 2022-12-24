package behavioral.ChainOfResponsibility;

public class Workload extends OrdersCart{

    public Workload(int levelOrders) {
        super(levelOrders);
    }

    @Override
    public void write(String message) {
        System.out.println("Assistent of Chef said: " + message);
    }
}
