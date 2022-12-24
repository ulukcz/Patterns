package structural.Proxy;

public class RealOrder implements Order {
    private String kebab;

    public RealOrder(String kebab) {
        this.kebab = kebab;
        prepare();
    }

    void prepare() {
        System.out.println(kebab + " is start to doing!");
    }

    @Override
    public void ready() {
        System.out.println(kebab + " is ready, please take it.");
    }
}
