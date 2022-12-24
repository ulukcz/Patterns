package creational.FactoryMethod;

public class GooglePixel implements Smartphone{
    @Override
    public void runOS() {
        System.out.println("Running Android...");
    }
}
