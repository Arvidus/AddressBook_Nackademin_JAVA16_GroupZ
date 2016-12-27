package AddressBook;


import java.util.List;

public class ListCommand implements Command {

    ConsolePrinter consolePrinter = null;
    List<Contact> contactList = null;
    ContactFormatter contactFormatter = null;


    public ListCommand(ConsolePrinter consolePrinter, List<Contact> contactList){
        this.consolePrinter = consolePrinter;
        this.contactList = contactList;
        this.contactFormatter = new ContactFormatter();
    }

    public String getName(){
        return null;
    }

    public String getDescription(){
        return null;
    }

    public void execute(){
        consolePrinter.print("Contacts:\n");
        for(Contact c : contactList){
            consolePrinter.print(contactFormatter.format(c));
        }
    }

    private void validate(){

    }
}
