package creational.Prototype;

public class BlueprintFactory {
    Blueprint blueprint;

    public BlueprintFactory(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    public void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    Blueprint cloneBlueprint() {
        return (Blueprint) blueprint.copy();
    }
}
