
package AddressBook;

public class CommandLineInterface implements InputHandler {

    CommandInterpreter commandInterpreter = new CommandInterpreter();
    ConsolePrinter consolePrinter = null;

    public CommandLineInterface(){

        Console console = new Console();
        consolePrinter = console;
        console.registerInputHandler(this);
}

    }

    @Override
    public void handle(CommandLine commandLine) {
        try {
            commandInterpreter.interpret(commandLine);
        } catch (InvalidCommandParameterException e) {
            e.printStackTrace();
        } catch (InvalidCommandException e) {
            e.printStackTrace();
        }
    }
}
