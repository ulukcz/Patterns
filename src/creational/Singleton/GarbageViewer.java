package creational.Singleton;

public class GarbageViewer {
    public static void main(String[] args) {
        Garbage.getGarbage().addTrash("apple core,\n");
        Garbage.getGarbage().addTrash("cherry pit,\n");
        Garbage.getGarbage().addTrash("coffee leftovers.\n");

        Garbage.getGarbage().showGarbage();
    }
}
