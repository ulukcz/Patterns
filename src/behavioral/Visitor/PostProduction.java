package behavioral.Visitor;

public class PostProduction implements MovieElements{
    @Override
    public void shooting(Director director) {
        director.create(this);
    }
}
