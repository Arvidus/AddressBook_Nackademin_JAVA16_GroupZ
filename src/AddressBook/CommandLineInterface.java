<<<<<<< HEAD:src/address_book/CommandLineInterface.java
package address_book;

package AddressBook;


import java.util.Scanner;

=======

package AddressBook;
>>>>>>> 629171b516548250bf6db3fb8009a055385ba6e7:src/AddressBook/CommandLineInterface.java

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
