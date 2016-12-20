package address_book;

/**
 * Created by Miroch on 2016-12-20.
 */
public class CommandLineInterface implements InputHandler {

    public CommandLineInterface(){

        Console console = new Console();

    }

    @Override
    public void handle(CommandLine commandLine) {
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        commandInterpreter.interpret(commandLine);
    }
}
