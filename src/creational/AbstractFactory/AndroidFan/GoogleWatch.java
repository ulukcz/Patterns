package creational.AbstractFactory.AndroidFan;

import creational.AbstractFactory.Watch;

public class GoogleWatch implements Watch {
    @Override
    public void myWatch() {
        System.out.println("I'm wearing Google Watch with WearOS");
    }
}
