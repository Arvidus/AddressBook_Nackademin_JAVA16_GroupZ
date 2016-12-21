
package AddressBook;

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
