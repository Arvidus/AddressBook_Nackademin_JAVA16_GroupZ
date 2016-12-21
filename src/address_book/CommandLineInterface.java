<<<<<<< HEAD:src/address_book/CommandLineInterface.java
package address_book;
=======
package AddressBook;


import java.util.Scanner;
>>>>>>> 9d36117ef6a90926fa6a01557683379388ac7ffc:src/AddressBook/CommandLineInterface.java

public class CommandLineInterface implements InputHandler {

    public CommandLineInterface(){

        Console console = new Console();

    }

    @Override
    public void handle(CommandLine commandLine) {
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        //commandInterpreter.interpret(commandLine);
    }
}
