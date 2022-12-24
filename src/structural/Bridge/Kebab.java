package structural.Bridge;

public abstract class Kebab {
    protected Meat meat;

    protected Kebab(Meat meat) {
        this.meat = meat;
    }
    abstract public String create();
}
