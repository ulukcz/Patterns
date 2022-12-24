package creational.AbstractFactory;

import creational.AbstractFactory.AppleFan.AppleFanFactory;

public class IOSDeveloperGadgets {
    public static void main(String[] args) {
        AppleFanFactory iosDeveloper = new AppleFanFactory();
        Phone phone = iosDeveloper.getPhone();
        Laptop laptop = iosDeveloper.getLaptop();
        Watch watch = iosDeveloper.getWatch();

        System.out.println("Looking IOS Develeoper gadgets:");
        phone.myPhone();
        laptop.myLaptop();
        watch.myWatch();
    }
}
