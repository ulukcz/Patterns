package structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class KebabFactory {
    public static final Map<String, Kebab> kebabs = new HashMap<>();

    public Kebab getKebabByName(String kebabName) {
        Kebab kebab = kebabs.get(kebabName);
        if(kebab == null) {
            switch (kebabName) {
                case "Doner":
                    System.out.println("Prepare Doner");
                    kebab = new DonerKebab();
                    break;
                case "Durum":
                    System.out.println("Prepare Durum");
                    kebab = new DurumKebab();
                    break;
                case "Talir":
                    System.out.println("Prepare Talir");
                    kebab = new TalirKebab();
                    break;
            }
            kebabs.put(kebabName, kebab);
        }
        return kebab;
    }
}
