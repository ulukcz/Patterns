package behavioral.Strategy;

public class TakePayment implements Requirements {
    @Override
    public void action() {
        System.out.println("Taking payments from clients.");
    }
}
