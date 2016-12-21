package AddressBook;

import java.util.ArrayList;
import java.util.List;

public class CommandInterpreter {

    Registry registry = new Registry();


    public Command interpret (CommandLine commandLine){

        List<String> temp = commandLine.parameters;

        switch(temp.get(0)){
            case "add":
                    AddContactCommand(, temp, registry);
                break;
            case "delete":

                break;
            case "list":
                break;
            case "search":
                break;
            case "help":
                break;
            case "quit":
                break;
        }

        commandLine.command = "";
        commandLine.parameters = new ArrayList<String>();

        return Command;
    }
}
