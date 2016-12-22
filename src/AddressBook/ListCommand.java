package AddressBook;


public class ListCommand implements Command {

    public ListCommand(Registry registry){
        for (Contact contact : registry.getContacts()){
            System.out.println(contact.getID() + " " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getEmailAdress() + "\n");
        }


    }

    public String getName(){
        return null;
    }

    public String getDescription(){
        return null;
    }

    public void execute(){

    }

    private void validate(){

    }
}
