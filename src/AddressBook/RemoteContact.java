package AddressBook;

/**
 * Created by Robin on 20/12/2016.
 */
public class RemoteContact extends ContactDetails implements Contact {
    private String id;

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
