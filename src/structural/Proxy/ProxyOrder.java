package structural.Proxy;

public class ProxyOrder implements Order{
    private String kebab;
    private RealOrder realOrder;

    public ProxyOrder(String kebab) {
        this.kebab = kebab;
    }

    @Override
    public void ready() {
        if (realOrder == null) {
            realOrder = new RealOrder(kebab);
        }
        realOrder.ready();
    }
}
