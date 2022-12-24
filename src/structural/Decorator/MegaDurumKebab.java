package structural.Decorator;

public class MegaDurumKebab extends KebabDecorator{
    public MegaDurumKebab(Kebab kebab) {
        super(kebab);
    }

    public String moreMeat() {
        return " with more meat!";
    }

    @Override
    public String createKebab() {
        return super.createKebab() + moreMeat();
    }
}
