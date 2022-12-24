package behavioral.Strategy;

public class Restaurant {
    public static void main(String[] args) {
        KebabWorker kebabWorker = new KebabWorker();

        kebabWorker.setRequirments(new Cleaning());
        kebabWorker.executeAction();
        kebabWorker.setRequirments(new PrepareMeat());
        kebabWorker.executeAction();
        kebabWorker.setRequirments(new DoingKebab());
        kebabWorker.executeAction();
        kebabWorker.setRequirments(new TakePayment());
        kebabWorker.executeAction();
    }
}
