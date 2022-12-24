package creational.AbstractFactory;

import creational.AbstractFactory.AndroidFan.AndroidFanFactory;

public class AndroidDeveloperGadgets {
    public static void main(String[] args) {
        AndroidFanFactory androidDeveloper = new AndroidFanFactory();
        Phone phone = androidDeveloper.getPhone();
        Laptop laptop = androidDeveloper.getLaptop();
        Watch watch = androidDeveloper.getWatch();

        System.out.println("Looking Andriod Develeoper gadgets:");
        phone.myPhone();
        laptop.myLaptop();
        watch.myWatch();
    }
}
