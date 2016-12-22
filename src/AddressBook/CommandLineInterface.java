
package AddressBook;

public class CommandLineInterface implements InputHandler {

    CommandInterpreter commandInterpreter = new CommandInterpreter();
    ConsolePrinter consolePrinter = null;

    public CommandLineInterface(){

while (true) {
    Console console = new Console();
    consolePrinter = console;
    console.registerInputHandler(this);
}

    }

    @Override
    public void handle(CommandLine commandLine) {
        //System.out.print("Kommer vi hit?");
        try {
            commandInterpreter.interpret(commandLine, consolePrinter);
        } catch (InvalidCommandParameterException e) {
            e.printStackTrace();
        } catch (InvalidCommandException e) {
            e.printStackTrace();
        }
    }
}
