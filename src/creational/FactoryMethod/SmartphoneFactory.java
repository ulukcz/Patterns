package creational.FactoryMethod;

public class SmartphoneFactory {
    public static Smartphone createNewSmartphone(String namePhone) {
        if (namePhone.equalsIgnoreCase("IPHONE"))
            return new Iphone();
        else if (namePhone.equalsIgnoreCase("GOOGLEPIXEL")) {
            return new GooglePixel();
        } else if (namePhone.equalsIgnoreCase("WINDOWSPHONE")) {
            return new WindowsPhone();
        } else {
            throw new RuntimeException(namePhone + " is not exists");
        }
    }
}
