package structural.Bridge;

public class DurumKebab extends Kebab {
    protected DurumKebab(Meat meat) {
        super(meat);
    }

    @Override
    public String create() {
        return "Create Durum Kebab with " + meat.fill() + ".";
    }
}
