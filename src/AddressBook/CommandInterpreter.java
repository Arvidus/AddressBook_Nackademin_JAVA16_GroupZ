<<<<<<< HEAD:src/address_book/CommandInterpreter.java
package address_book;
=======
package AddressBook;
>>>>>>> 629171b516548250bf6db3fb8009a055385ba6e7:src/AddressBook/CommandInterpreter.java

public class CommandInterpreter {


    public Command interpret (CommandLine commandLine){


        switch(commandLine.parameters.get(0)){
            case "add":
                AddContactCommand addContactCommand = new AddContactCommand();
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
    }

}
