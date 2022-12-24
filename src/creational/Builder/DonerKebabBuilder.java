package creational.Builder;

public class DonerKebabBuilder extends KebabBuilder {
    @Override
    void buildMeat() {
        kebab.setMeat("Beef");
    }

    @Override
    void buildSauce() {
        kebab.setSauce("Garlic");
    }

    @Override
    void buildWrapper() {
        kebab.setWrapper(Wrapper.BUN);
    }

    @Override
    void buildPrice() {
        kebab.setPrice(100);
    }
}
