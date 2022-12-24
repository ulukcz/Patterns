package structural.Facade;

public class Order {
    private boolean order;
    public boolean hasOrder() {
        return order;
    }
    public void yesOrder() {
        System.out.println("We have order!");
        order = true;
    }
    public void noOrder() {
        System.out.println("No order");
        order = false;
    }
}
