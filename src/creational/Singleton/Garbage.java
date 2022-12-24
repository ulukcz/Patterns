package creational.Singleton;

public class Garbage {
    private static Garbage garbage;
    private static String trash = "Garbage have that items: \n";

    public static synchronized Garbage getGarbage() {
        if (garbage == null)
            garbage = new Garbage();
        return garbage;
    }
    private Garbage() {

    }

    public void addTrash(String newTrash) {
        trash += newTrash;
    }
    public void showGarbage() {
        System.out.println(trash);
    }
}
