package creational.Prototype;

public class Blueprint implements Copyable {
    private int id;
    private String blueprintName;
    private String blueprintsSource;

    public Blueprint(int id, String blueprintName, String blueprintsSource) {
        this.id = id;
        this.blueprintName = blueprintName;
        this.blueprintsSource = blueprintsSource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlueprintName() {
        return blueprintName;
    }

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    public String getBlueprintsSource() {
        return blueprintsSource;
    }

    public void setBlueprintsSource(String blueprintsSource) {
        this.blueprintsSource = blueprintsSource;
    }

    @Override
    public Object copy() {
        Blueprint copy = new Blueprint(id, blueprintName, blueprintsSource);
        return copy;
    }

    @Override
    public String toString() {
        return "Blueprint{" +
                "id=" + id +
                ", blueprintName='" + blueprintName + '\'' +
                ", blueprintsSource='" + blueprintsSource + '\'' +
                '}';
    }
}
