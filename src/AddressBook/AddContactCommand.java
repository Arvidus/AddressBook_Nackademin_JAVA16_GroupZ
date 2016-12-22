package AddressBook;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class AddContactCommand implements Command{

    List<String> parameters = new ArrayList<String>();
    Registry registry = new Registry();

    public AddContactCommand(ConsolePrinter consolePrinter, Registry registry, ArrayList<String> parameters) {
        this.registry = registry;
        this.parameters = parameters;
    }

    @Override
    public void getName() {

    }

    @Override
    public void getDescription() {

    }

    @Override
    public void execute() {
        if(validate()) {
            registry.addContact(parameters.get(1), parameters.get(2), parameters.get(3));
        } else {
            System.out.println("Could not validate the Add command.");
        }
    }

    private boolean validate(){
        if(parameters.get(1).length() > 0 && parameters.get(2).length() > 0 %% parameters.get(3).length() > 0){
            return true;
        } else {
            return false;
        }
    }
}
