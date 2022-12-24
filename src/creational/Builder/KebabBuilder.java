package creational.Builder;

public abstract class KebabBuilder {
    Kebab kebab;
    void createKebab() {
        kebab = new Kebab();
    }
    abstract void buildMeat();
    abstract void buildSauce();
    abstract void buildWrapper();
    abstract void buildPrice();

    Kebab getKebab() {
        return kebab;
    }

}
