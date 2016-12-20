package AddressBook;

import java.util.*;

/**
 * Created by Robin on 20/12/2016.
 */
public class Registry {
    private List<Contact> contacts = new ArrayList<Contact>();
    UUID id = UUID.randomUUID();
    public void addContact(String firstName, String lastName, String email){
        contacts.add(new LocalContact(firstName, lastName, email, id));
    }

    public ArrayList<Contact> getContacts(){

        return new ArrayList<>();
    }

    public void deleteContact(String id){

    }

    public ArrayList<Contact> search(String term){

        return new ArrayList<>();
    }

    public void load(){

    }
}
