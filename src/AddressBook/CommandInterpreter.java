
package AddressBook;

import java.util.ArrayList;
import java.util.List;

public class CommandInterpreter{

    Registry registry = new Registry();
    ConsolePrinter consolePrinter = null;

    public CommandInterpreter(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }


    public void interpret(CommandLine commandLine) throws InvalidCommandException{

        List<String> temp = commandLine.parameters;
        //ArrayList<String> temp = new ArrayList<>();

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
                ListCommand listCommand = new ListCommand(registry);
                listCommand.execute();
                break;
            case "search":
                SearchCommand searchCommand = new SearchCommand(consolePrinter, registry, temp);
                searchCommand.execute();
                break;
            case "help":
                break;
            case "quit":
                break;
            default:
                throw new InvalidCommandException("Could not interpret the command");
        }
    }

}
