package creational.Prototype;

public class EngineerRunner {
    public static void main(String[] args) {
        Blueprint engineBlueprint = new Blueprint(10, "Super Scheme", "This is a Scheme of infinite engine");

        BlueprintFactory factory = new BlueprintFactory(engineBlueprint);
        Blueprint cloneEngineBlueprint = factory.cloneBlueprint();
        System.out.println("Original:\n" + engineBlueprint);
        System.out.println("\n|||||||||||||||||||||||||||||\n");
        System.out.println("Clone:\n" + cloneEngineBlueprint);
    }
}
