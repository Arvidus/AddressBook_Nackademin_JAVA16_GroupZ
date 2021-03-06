package AddressBook;

import java.io.Serializable;


public class RemoteContact extends ContactDetails implements Contact, Serializable{
    private String id;

    public RemoteContact(String id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getID() {
        return id;
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
