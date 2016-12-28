package AddressBook;

import java.util.ArrayList;


public class AtomicRemoteCatalogueProxy implements RemoteCatalogueProxy {

    private String host;
    private int port;

    public AtomicRemoteCatalogueProxy(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public ArrayList<String> getContacts() {
        ArrayList<String> tempRemoteContacts = new ArrayList<>();
        CatalogueClient cc = new CatalogueClient(host, port);
        cc.connect();
        cc.sendRequest("getall");
        String tempResponse = cc.waitForResponse();
        cc.disconnect();

        String[] contactRow = tempResponse.split("\n");

        for (String contact : contactRow) {
            if (contact.length() > 0) {
                tempRemoteContacts.add(contact);
            }
        }
        return tempRemoteContacts;
    }
}
