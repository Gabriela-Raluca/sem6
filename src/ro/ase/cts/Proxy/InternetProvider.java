package ro.ase.cts.Proxy;

public class InternetProvider implements  Internet {
    @Override
    public void connectTo(String url) {
        System.out.println("Conexiunea este ok");
    }
}
