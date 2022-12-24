package structural.Facade;

public class Prepare {
    public void prepare(Order order) {
        if (order.hasOrder())
            System.out.println("Prepare give you food");
        else
            System.out.println("Nothing to do, just prepare meat.");
    }
}
