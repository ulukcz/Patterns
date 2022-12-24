package creational.AbstractFactory.AndroidFan;

import creational.AbstractFactory.Phone;

public class AndroidPhone implements Phone {
    @Override
    public void myPhone() {
        System.out.println("I have Google Pixel");
    }
}
