package AddressBook;

public class CatalogueLoader {
    public void run() {
        RemoteCatalogueFactory rcf = new RemoteCatalogueFactory(61616);
        RemoteCatalogueProxy rcp = rcf.create("localhost");
        rcp.getContacts();
    }
}
