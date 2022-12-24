package creational.Builder;

public class Kebab {
    private int price;
    private Wrapper wrapper;
    private String meat;
    private String sauce;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Kebab{" +
                "price=" + price +
                ", wrapper=" + wrapper +
                ", meat='" + meat + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
