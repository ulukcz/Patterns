package structural.Decorator;

public class Restaurant {
    public static void main(String[] args) {
        Kebab durum = new SuperMegaDurumKebab(new MegaDurumKebab(new DurumKebab())) ;

        System.out.println(durum.createKebab());
    }
}
