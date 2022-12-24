package behavioral.Iterator;

public class Restaurant {
    public static void main(String[] args) {
        String[] skills = {"Doner", "Durum", "Talir", "Box Kebab"};
        KebabWorker kebabWorker = new KebabWorker("Rauf Malik", skills);

        Iterator iterator = kebabWorker.getIterator();

        System.out.println("Kebab worker name: " + kebabWorker.name);
        System.out.println("Skills:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
