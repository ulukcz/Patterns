package creational.FactoryMethod;

public class WindowsPhone implements Smartphone{
    @Override
    public void runOS() {
        System.out.println("Nothing to run, cause I'm dead...");
    }
}
