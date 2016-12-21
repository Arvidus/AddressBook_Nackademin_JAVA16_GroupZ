package AddressBook;


public class ListCommand implements Command {

    public ListCommand(Registry registry){
        for (Contact contact : registry.getContacts()){
            System.out.println(contact.getID() + " " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getEmailAdress() + "\n");
        }


    }

    public void getName(){

    }

    public void getDescription(){

    }

    public void execute(){

    }

    private void validate(){

    }
}
