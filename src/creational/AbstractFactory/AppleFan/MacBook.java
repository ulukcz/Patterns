package creational.AbstractFactory.AppleFan;

import creational.AbstractFactory.Laptop;

public class MacBook implements Laptop {
    @Override
    public void myLaptop() {
        System.out.println("I have Macbook with MacOS.");
    }
}
