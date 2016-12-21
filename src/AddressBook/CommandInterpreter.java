
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

        List<String> temp = commandLine.parameters;

        switch(temp.get(0)){
            case "add":
               // AddContactCommand(, temp, registry);
                break;
            case "delete":
               // DeleteContactCommand();
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
