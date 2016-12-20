package AddressBook;

import java.util.Scanner;

/**
 * Created by Miroch on 2016-12-20.
 */
public class CommandLineInterface implements InputHandler {

    public CommandLineInterface(){
        Console console = new Console();
        CommandInterpreter commandInterpreter = new CommandInterpreter();

    }

    @Override
    public void handle(CommandLine commandLine) {

    }
}
