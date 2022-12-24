package structural.Decorator;

public class KebabDecorator implements Kebab {
    Kebab kebab;
    public KebabDecorator(Kebab kebab) {
        this.kebab = kebab;
    }
    @Override
    public String createKebab() {
        return kebab.createKebab();
    }
}
