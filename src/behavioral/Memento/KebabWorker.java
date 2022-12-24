package behavioral.Memento;

public class KebabWorker {
    private String name;
    private String address;
    private int salary;

    public KebabWorker(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public SaveWorkerData save() {
        return new SaveWorkerData(name, address);
    }

    public void load(SaveWorkerData saveWorkerData) {
        name = saveWorkerData.getName();
        address = saveWorkerData.getAddress();
    }

    @Override
    public String toString() {
        return  name + ", " +
                address + ", " +
                salary + "\n";
    }
}