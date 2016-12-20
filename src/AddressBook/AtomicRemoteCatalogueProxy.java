package AddressBook;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Robin on 20/12/2016.
 */
public class AtomicRemoteCatalogueProxy implements RemoteCatalogueProxy {

    private String host;
    private int port;

    public AtomicRemoteCatalogueProxy (String host, int port){
        this.host = host;
        this.port = port;
    }

    @Override
    public ArrayList<Contact> getContacts() {
        ArrayList<Contact> tempRemoteContacts = new ArrayList<>();
        CatalogueClient cc = new CatalogueClient(host, port);


        return tempRemoteContacts;
    }
}
