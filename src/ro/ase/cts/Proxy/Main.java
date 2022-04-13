package ro.ase.cts.Proxy;

public class Main {
    public static void main(String[] args) {
        Internet conexiune= (Internet) new InternetProxy();
        ((InternetProxy)conexiune).addInBlacklist("abc.com");
        conexiune.connectTo("abc.com");
        conexiune.connectTo("ABC.com");

        testConexiune(conexiune,"abc.com");
    }

    public static void testConexiune(Internet i, String url){
        i.connectTo(url);
    }
}
