package creational.AbstractFactory.AndroidFan;

import creational.AbstractFactory.Laptop;

public class LinuxLaptop implements Laptop {
    @Override
    public void myLaptop() {
        System.out.println("I'm using Laptop on Linux OS");
    }
}
