package creational.AbstractFactory.AndroidFan;

import creational.AbstractFactory.HumanGadgetFactory;
import creational.AbstractFactory.Laptop;
import creational.AbstractFactory.Phone;
import creational.AbstractFactory.Watch;

public class AndroidFanFactory implements HumanGadgetFactory {
    @Override
    public Phone getPhone() {
        return new AndroidPhone();
    }

    @Override
    public Laptop getLaptop() {
        return new LinuxLaptop();
    }

    @Override
    public Watch getWatch() {
        return new GoogleWatch();
    }
}
