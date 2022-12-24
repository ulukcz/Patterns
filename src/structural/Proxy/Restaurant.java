package structural.Proxy;

public class Restaurant {
    public static void main(String[] args) {
        Order client = new ProxyOrder("Doner kebab");
        client.ready();
    }
}
