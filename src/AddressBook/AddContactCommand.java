package AddressBook;


import java.util.ArrayList;
import java.util.List;

public class AddContactCommand implements Command{

    List<String> parameters = new ArrayList<String>();
    Registry registry = null;
    ConsolePrinter consolePrinter = null;

    public AddContactCommand(ConsolePrinter consolePrinter, Registry registry, ArrayList<String> parameters) {
        this.consolePrinter = consolePrinter;
        this.registry = registry;
        this.parameters = parameters;
    }

    @Override
    public String getName() {
        return (parameters.get(1) + " " + parameters.get(2));
    }

    @Override
    public String getDescription() {
        return (parameters.get(1) + " " + parameters.get(2));
    }

    @Override
    public void execute() {
        if(validate()) {
            consolePrinter.print("Added " + parameters.get(1) + " " + parameters.get(2) + " to the contact list.");
            registry.addContact(parameters.get(1), parameters.get(2), parameters.get(3));
        } else {
            consolePrinter.print("Could not validate the contact");
        }
    }

    private boolean validate(){
        if (parameters.get(1).length() > 0 && parameters.get(2).length() > 0 && parameters.get(3).length() > 0){
            return true;
        } else {
            return false;
        }
    }
}
