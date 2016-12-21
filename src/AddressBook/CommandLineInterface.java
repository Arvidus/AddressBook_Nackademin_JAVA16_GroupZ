<<<<<<< HEAD:src/address_book/CommandLineInterface.java
package address_book;

package AddressBook;


import java.util.Scanner;

=======

package AddressBook;
>>>>>>> 629171b516548250bf6db3fb8009a055385ba6e7:src/AddressBook/CommandLineInterface.java

public class CommandLineInterface implements InputHandler {

    CommandInterpreter commandInterpreter = new CommandInterpreter();

    public CommandLineInterface(){

while (true) {
    Console console = new Console();
    console.registerInputHandler(this);
}

    }

    @Override
    public void handle(CommandLine commandLine) {
        System.out.print("Kommer vi hit?");
        commandInterpreter.interpret(commandLine);
    }
}
