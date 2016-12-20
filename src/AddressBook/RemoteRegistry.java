package AddressBook;

import java.util.ArrayList;

/**
 * Created by Robin on 20/12/2016.
 */
public class RemoteRegistry {
    protected ArrayList<Contact> remoteContacts = new ArrayList<Contact>();

    public ArrayList<Contact> getContacts(){
        return remoteContacts;
    }

    public void add(String id, String firstName, String lastName, String email){
        remoteContacts.add(new RemoteContact(id, firstName, lastName, email));
    }

    public ArrayList<Contact> search(String term){
        ArrayList<Contact> searchList = new ArrayList<>();
        for(Contact c : remoteContacts){
            if(c.getFirstName().contains(term) || c.getLastName().contains(term)){
                searchList.add(c);
            }
        }
        return searchList;
    }
}
