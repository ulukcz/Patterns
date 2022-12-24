package structural.Decorator;

public class SuperMegaDurumKebab extends KebabDecorator{
    public SuperMegaDurumKebab(Kebab kebab) {
        super(kebab);
    }

    public String withFakeMeat() {
        return " More meat than you can eat!";
    }

    @Override
    public String createKebab() {
        return super.createKebab() + withFakeMeat();
    }
}
