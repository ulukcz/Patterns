package behavioral.Visitor;

public class ShortMovieDirector implements Director{
    @Override
    public void create(Preproduction preproduction) {
        System.out.println("Preparing a week to do short movie...");
    }

    @Override
    public void create(InProduction inProduction) {
        System.out.println("Shooting 3 days...");
    }

    @Override
    public void create(PostProduction postProduction) {
        System.out.println("Coloring, doing audio and special effects around one month...");
    }
}
