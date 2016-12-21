<<<<<<< HEAD:src/address_book/CommandInterpreter.java
package address_book;
=======
package AddressBook;
>>>>>>> 629171b516548250bf6db3fb8009a055385ba6e7:src/AddressBook/CommandInterpreter.java

import java.util.ArrayList;
import java.util.List;

public class CommandInterpreter {

    Registry registry = new Registry();


    public Command interpret (CommandLine commandLine){

        List<String> temp = commandLine.parameters;

        switch(temp.get(0)){
            case "add":
<<<<<<< HEAD
                    AddContactCommand(, temp, registry);
=======
                AddContactCommand addContactCommand = new AddContactCommand();
>>>>>>> 4d98d41b535aabd23e13cd537933521d37a91fe8
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
<<<<<<< HEAD
=======
    }
>>>>>>> 4d98d41b535aabd23e13cd537933521d37a91fe8

        commandLine.command = "";
        commandLine.parameters = new ArrayList<String>();

        return Command;
    }
}
