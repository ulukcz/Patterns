package creational.AbstractFactory.AppleFan;

import creational.AbstractFactory.HumanGadgetFactory;
import creational.AbstractFactory.Laptop;
import creational.AbstractFactory.Phone;
import creational.AbstractFactory.Watch;

public class AppleFanFactory implements HumanGadgetFactory {
    @Override
    public Phone getPhone() {
        return new Iphone();
    }

    @Override
    public Laptop getLaptop() {
        return new MacBook();
    }

    @Override
    public Watch getWatch() {
        return new Iwatch();
    }
}
