package creational.Builder;

public class KebabRunner {
    public static void main(String[] args) {
        KebabOwner kebabOwner = new KebabOwner();

        kebabOwner.setBuilder(new DonerKebabBuilder());
        Kebab kebab1 = kebabOwner.buildKebab();

        System.out.println(kebab1);
        kebabOwner.setBuilder(new DurumKebabBuilder());
        Kebab kebab2 = kebabOwner.buildKebab();
        System.out.println(kebab2);
    }
}
