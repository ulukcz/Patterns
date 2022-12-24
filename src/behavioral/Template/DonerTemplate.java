package behavioral.Template;

public abstract class DonerTemplate {
    public void doDoner() {
        System.out.print("Doner with meat, salat and ");
        sauce();
    }
    public abstract void sauce();
}
