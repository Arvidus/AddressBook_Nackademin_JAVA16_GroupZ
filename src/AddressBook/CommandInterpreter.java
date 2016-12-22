
package AddressBook;

import java.util.ArrayList;
import java.util.List;

public class CommandInterpreter {

    Registry registry = new Registry();
    ConsolePrinter consolePrinter;

    public CommandInterpreter() {
    }


    public void interpret(CommandLine commandLine){

        //List<String> temp = commandLine.parameters;
        ArrayList<String> temp = new ArrayList<>();

        switch(temp.get(0)){
            case "add":
                AddContactCommand addContactCommand = new AddContactCommand(consolePrinter, registry, temp);
                addContactCommand.execute();
                break;
            case "delete":
                DeleteContactCommand deleteContactCommand = new DeleteContactCommand(consolePrinter, registry, temp);
                deleteContactCommand.execute();
                break;
            case "list":
                new ListCommand(registry);
                break;
            case "search":
                break;
            case "help":
                break;
            case "quit":
                break;
        }
    }

}
