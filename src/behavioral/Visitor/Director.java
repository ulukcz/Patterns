package behavioral.Visitor;

public interface Director {
    void create(Preproduction preproduction);
    void create(InProduction inProduction);
    void create(PostProduction postProduction);
}
