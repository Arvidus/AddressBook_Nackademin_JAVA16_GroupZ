
package AddressBook;

public class CommandLineInterface implements InputHandler {

    CommandInterpreter commandInterpreter = new CommandInterpreter();

    public CommandLineInterface(){

        Console console = new Console();
        console.registerInputHandler(this);

    }

    @Override
    public void handle(CommandLine commandLine) {
        try {
            commandInterpreter.interpret(commandLine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
