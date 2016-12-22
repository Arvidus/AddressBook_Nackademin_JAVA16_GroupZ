
package AddressBook;

import java.util.ArrayList;
import java.util.List;

public class CommandInterpreter {

    Registry registry = new Registry();
    ConsolePrinter consolePrinter;

    public CommandInterpreter(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }


    public Command interpret (CommandLine commandLine){

        //List<String> temp = commandLine.parameters;
        ArrayList<String> temp = new ArrayList<>();

        switch(temp.get(0)){
            case "add":
                new AddContactCommand(consolePrinter, registry, temp);
                break;
            case "delete":
                new DeleteContactCommand(consolePrinter, registry, temp);
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
}
