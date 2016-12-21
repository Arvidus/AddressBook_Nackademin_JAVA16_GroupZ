package AddressBook;


import java.util.Scanner;

public class CommandLineInterface implements InputHandler {

    public CommandLineInterface(){
        Console console = new Console();
        CommandInterpreter commandInterpreter = new CommandInterpreter();

    }

    @Override
    public void handle(CommandLine commandLine) {

    }
}
