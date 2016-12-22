package AddressBook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactListSorter {

    public String sort(ArrayList<Contact> contacts){
        String sortResults ="";
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        for (Contact contact : contacts) {
            sortResults += contact.getID() + " " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getEmailAdress() + "\n";
        }

        return sortResults;
    }
}
