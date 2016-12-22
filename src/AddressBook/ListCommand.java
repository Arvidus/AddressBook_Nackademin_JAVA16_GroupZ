package AddressBook;


public class ListCommand implements Command {

    String listResults = "";

    public ListCommand(Registry registry){
        for (Contact contact : registry.getContacts()){
           listResults += contact.getID() + " " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getEmailAdress() + "\n";
        }
    }

    public String getName(){
        return null;
    }

    public String getDescription(){
        return null;
    }

    public void execute(){
        System.out.println(listResults);
    }

    private void validate(){

    }
}
