package behavioral.Template;

public class Restaurant {
    public static void main(String[] args) {
        DonerGarlic donerGarlic = new DonerGarlic();
        DonerSpicy donerSpicy = new DonerSpicy();

        System.out.println("First doner is:");
        donerGarlic.doDoner();
        System.out.println("==========================");
        System.out.println("Second doner is:");
        donerSpicy.doDoner();
    }
}
