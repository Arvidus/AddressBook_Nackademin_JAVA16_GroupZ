package AddressBook;

public class ContactFormatter {

    public String format(Contact contact){
        String ret = "";
        ret = contact.getID() + "\n"
              + contact.getFirstName() + "\n"
              + contact.getLastName() + "\n"
              + contact.getEmailAdress();
        return ret;
    }

}
