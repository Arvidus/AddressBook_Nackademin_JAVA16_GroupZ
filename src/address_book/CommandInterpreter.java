package address_book;

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
