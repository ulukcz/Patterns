package behavioral.Strategy;

public class PrepareMeat implements Requirements {
    @Override
    public void action() {
        System.out.println("Preparing meat to kebabs.");
    }
}
