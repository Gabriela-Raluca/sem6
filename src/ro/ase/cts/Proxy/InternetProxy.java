package ro.ase.cts.Proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {

    InternetProvider ip= new InternetProvider();
    ArrayList <String> blacklist= new ArrayList<>();

    public void addInBlacklist(String url)
    {

        blacklist.add(url);
    }
    public void removeFromBlackList(String url)
    {
        if(!blacklist.isEmpty()&&blacklist.contains(url))
            blacklist.remove(url);
    }

    @Override
    public void connectTo(String url) {
        if(blacklist.contains(url))
        {
            System.out.println("Conexiunea e blocata");
        }
        else
        {
            ip.connectTo(url);
        }
    }
}
