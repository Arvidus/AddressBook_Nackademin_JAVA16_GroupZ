
package AddressBook;

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
