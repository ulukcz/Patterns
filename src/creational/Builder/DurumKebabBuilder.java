package creational.Builder;

public class DurumKebabBuilder extends KebabBuilder {
    @Override
    void buildMeat() {
        kebab.setMeat("Beef, Chicken");
    }

    @Override
    void buildSauce() {
        kebab.setSauce("Spicy");
    }

    @Override
    void buildWrapper() {
        kebab.setWrapper(Wrapper.PITA);
    }

    @Override
    void buildPrice() {
        kebab.setPrice(150);
    }
}
