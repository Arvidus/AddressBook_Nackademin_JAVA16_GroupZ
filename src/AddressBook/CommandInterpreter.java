
package AddressBook;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CommandInterpreter{


    ConsolePrinter consolePrinter = null;

    public void interpret(CommandLine commandLine, Registry registry, ConsolePrinter consolePrinter) throws InvalidCommandException, InvalidCommandParameterException{

        List<String> temp = commandLine.parameters;
        this.consolePrinter = consolePrinter;
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
                QuitCommand quitCommand = new QuitCommand(consolePrinter, temp);
                quitCommand.execute();
                break;
            default:
                throw new InvalidCommandException("Could not interpret the command");
        }
    }

}
