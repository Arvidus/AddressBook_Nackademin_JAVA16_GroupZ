package AddressBook;

import java.io.Serializable;
import java.util.*;

public class Registry implements Serializable{



    protected ArrayList<Contact> contacts = new ArrayList<Contact>();
    UUID id = UUID.randomUUID();

    public Registry(){}

    public void addContact(String firstName, String lastName, String email){
        contacts.add(new LocalContact(firstName, lastName, email, id));
    }

    public ArrayList<Contact> getContacts(){
        return contacts;
    }

    public void deleteContact(String id){
        for(Contact c : contacts){
            if (c instanceof RemoteContact) {
                if (c.getID().equals(id)) {
                    contacts.remove(c);
                }
            }
        }
    }

    public ArrayList<Contact> search(String term){
        ArrayList<Contact> searchList = new ArrayList<>();
        for(Contact c : contacts){
            if(c.getFirstName().contains(term) || c.getLastName().contains(term)){
                searchList.add(c);
            }
        }
        return searchList;
    }

    public void load(ArrayList<Contact> contacts){
        this.contacts.addAll(contacts);
    }
}
