package AddressBook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ContactListSorter {

    public ContactListSorter(ArrayList<Contact> searchResults){
        Collections.sort(searchResults, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }
}
