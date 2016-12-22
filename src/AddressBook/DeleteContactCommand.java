package AddressBook;

import java.util.List;

/**
 * Created by Gustav on 2016-12-21.
 */
public class DeleteContactCommand implements Command {

    List<String> parameters = null;
    ConsolePrinter consolePrinter = null;
    Registry registry = null;

    public DeleteContactCommand( ConsolePrinter consolePrinter, Registry registry, List<String> parameters){
        this.parameters = parameters;
        this.consolePrinter = consolePrinter;
        this.registry = registry;
    }


    public String getName(){
        return "delete";
    }

    public String getDescription(){
        return "deletes a contact using its id.";
    }

    public void execute() throws InvalidCommandParameterException{
        if (validate()) {
            consolePrinter.print("Deleting the contact with id: " + parameters.get(1));
            registry.deleteContact(parameters.get(1));
        } else {
            throw new InvalidCommandParameterException("Invalid parameters.");
        }
    }

    private boolean validate(){
        if (parameters.get(1).length() > 0){
            return true;
        } else {
            return false;
        }
    }
}
