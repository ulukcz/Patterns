package structural.Adapter;

public class AdapterRealityAndOwner extends Reality implements Rent{
    @Override
    public void look() {
        lookApartment();
    }

    @Override
    public void pay() {
        payForApartment();
    }

    @Override
    public void clean() {
        cleanApartment();
    }
}
