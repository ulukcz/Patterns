package structural.Bridge;

public class Chicken implements Meat {
    @Override
    public String fill() {
        return "Chicken meat";
    }
}
