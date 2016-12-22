package AddressBook;


import java.util.ArrayList;
import java.util.List;

public class AddContactCommand implements Command{

    List<String> parameters = new ArrayList<String>();
    Registry registry = null;
    ConsolePrinter consolePrinter = null;

    public AddContactCommand(ConsolePrinter consolePrinter, Registry registry, List<String> parameters) {
        this.consolePrinter = consolePrinter;
        this.registry = registry;
        this.parameters = parameters;
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return "adds a contact using firstname, lastname and emailadress.";
    }

    @Override
    public void execute() throws InvalidCommandParameterException{
        if(validate()) {
            consolePrinter.print("Added " + parameters.get(1) + " " + parameters.get(2) + " to the contact list.");
            registry.addContact(parameters.get(1), parameters.get(2), parameters.get(3));
        } else {
            throw new InvalidCommandParameterException("Invalid parameters.");
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
