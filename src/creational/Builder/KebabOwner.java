package creational.Builder;

public class KebabOwner {
    KebabBuilder builder;
    public void setBuilder(KebabBuilder builder) {
        this.builder = builder;
    }
    Kebab buildKebab() {
        builder.createKebab();
        builder.buildMeat();
        builder.buildSauce();
        builder.buildWrapper();
        builder.buildPrice();

        return builder.getKebab();
    }
}
