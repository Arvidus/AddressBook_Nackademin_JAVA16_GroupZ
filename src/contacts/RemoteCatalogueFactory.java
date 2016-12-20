package contacts;

public class RemoteCatalogueFactory{
    private int defaultPort;

    RemoteCatalogueFactory (int port){
        this.defaultPort = port;
    }

    public RemoteCatalogueProxy create(String host){
        return new AtomicRemoteCatalogueProxy(host,defaultPort);
    }
}