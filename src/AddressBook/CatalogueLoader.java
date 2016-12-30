package AddressBook;

import java.util.ArrayList;

public class CatalogueLoader {
    RemoteRegistry remoteRegistry;

    public CatalogueLoader(RemoteRegistry remoteRegistry) {
        this.remoteRegistry = remoteRegistry;
    }

    public void run() {
        RemoteCatalogueFactory rcf = new RemoteCatalogueFactory(61616);
        RemoteCatalogueProxy rcp = rcf.create("192.168.10.237");
        ArrayList<String> contactsFromServer = rcp.getContacts();

        for (String s : contactsFromServer) {
            if (s.length() > 0) {
                String[] contact = s.split(",");
                remoteRegistry.add(contact[0], contact[1], contact[2], contact[3]);
            }
        }
    }
}
