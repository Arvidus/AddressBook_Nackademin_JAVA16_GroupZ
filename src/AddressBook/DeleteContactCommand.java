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
        return null;
    }

    public String getDescription(){
        return null;
    }

    public void execute(){
        if (validate()) {
            consolePrinter.print("Deleting the contact with id: " + parameters.get(1));
            registry.deleteContact(parameters.get(1));
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
