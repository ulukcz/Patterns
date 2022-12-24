package structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        KebabFactory factory = new KebabFactory();
        List<Kebab> kebabs = new ArrayList<>();

        kebabs.add(factory.getKebabByName("Talir"));
        kebabs.add(factory.getKebabByName("Doner"));
        kebabs.add(factory.getKebabByName("Doner"));
        kebabs.add(factory.getKebabByName("Durum"));
        kebabs.add(factory.getKebabByName("Talir"));

        for (Kebab kebab:kebabs) {
            kebab.doKebab();
        }
    }
}
