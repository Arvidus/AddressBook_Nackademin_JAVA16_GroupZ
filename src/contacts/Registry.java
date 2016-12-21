package contacts;

import java.io.Serializable;
import java.util.*;

public class Registry implements Serializable{

    protected static ArrayList<Contact> contacts = new ArrayList<Contact>();
    UUID id = UUID.randomUUID();

    public void addContact(String firstName, String lastName, String email){
        contacts.add(new LocalContact(firstName, lastName, email, id));
    }

    public ArrayList<Contact> getContacts(){

        return contacts;
    }

    public void deleteContact(String id){
        for(Contact c : contacts){
            if (c.getID().equals(id)){
                contacts.remove(c);
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

    public void load(){
        RegistryPersister.load();
    }
}
