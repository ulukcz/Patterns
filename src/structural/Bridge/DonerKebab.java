package structural.Bridge;

public class DonerKebab extends Kebab {
    protected DonerKebab(Meat meat) {
        super(meat);
    }

    @Override
    public String create() {
        return "Create Doner Kebab with " + meat.fill() + ".";
    }
}
