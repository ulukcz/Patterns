package creational.FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        Smartphone phone1 = SmartphoneFactory.createNewSmartphone("Iphone");
        phone1.runOS();
        Smartphone phone2 = SmartphoneFactory.createNewSmartphone("WindowsPhone");
        phone2.runOS();
        Smartphone phone3 = SmartphoneFactory.createNewSmartphone("GooglePixel");
        phone3.runOS();
    }
}