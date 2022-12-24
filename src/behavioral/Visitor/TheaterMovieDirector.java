package behavioral.Visitor;

public class TheaterMovieDirector implements Director{
    @Override
    public void create(Preproduction preproduction) {
        System.out.println("Preparing a 2-3 month to do a movie for theaters...");
    }

    @Override
    public void create(InProduction inProduction) {
        System.out.println("Shooting 3 month in 10 locations...");
    }

    @Override
    public void create(PostProduction postProduction) {
        System.out.println("Many post-production routine in one year...");
    }
}
