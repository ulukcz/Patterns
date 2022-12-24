package structural.Bridge;

public class CreateKebab {
    public static void main(String[] args) {
        Kebab donerWithBeef = new DonerKebab(new Beef());
        Kebab durumWithChicken = new DurumKebab(new Chicken());
        Kebab donerWithChicken = new DonerKebab(new Chicken());

        System.out.println(donerWithBeef.create());
        System.out.println(durumWithChicken.create());
        System.out.println(donerWithChicken.create());
    }
}
