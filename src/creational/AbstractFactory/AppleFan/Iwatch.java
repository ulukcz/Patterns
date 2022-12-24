package creational.AbstractFactory.AppleFan;

import creational.AbstractFactory.Watch;

public class Iwatch implements Watch {
    @Override
    public void myWatch() {
        System.out.println("I'm wearing iwatch");
    }
}
