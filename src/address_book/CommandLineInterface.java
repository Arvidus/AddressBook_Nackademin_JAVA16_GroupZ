<<<<<<< HEAD:src/address_book/CommandLineInterface.java
package address_book;
=======
package AddressBook;

<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 9d36117ef6a90926fa6a01557683379388ac7ffc:src/AddressBook/CommandLineInterface.java

/**
 * Created by Miroch on 2016-12-20.
 */
>>>>>>> 7ebc3b354df46c879e6c694ef8158b1c7e7b4d9a
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
