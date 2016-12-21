
package address_book;

<<<<<<< HEAD
=======

>>>>>>> ab323e3c4a3181cf7148cddc4f95ac1fbaee8958
import java.util.Scanner;

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
