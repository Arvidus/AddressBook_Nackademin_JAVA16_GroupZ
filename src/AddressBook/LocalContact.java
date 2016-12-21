package AddressBook;

import java.io.Serializable;
import java.util.UUID;

public class LocalContact extends ContactDetails implements Contact, Serializable{
    private UUID id;

    public LocalContact(String firstName, String lastName, String email, UUID id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }

    @Override
    public String getID() {
        return id.toString();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmailAdress() {
        return email;
    }
}
