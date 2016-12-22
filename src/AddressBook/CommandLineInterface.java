
package AddressBook;

public class CommandLineInterface implements InputHandler {

    CommandInterpreter commandInterpreter = new CommandInterpreter();
    ConsolePrinter consolePrinter = null;

    public CommandLineInterface(){

<<<<<<< HEAD
        Console console = new Console();
        console.registerInputHandler(this);
=======
while (true) {
    Console console = new Console();
    consolePrinter = console;
    console.registerInputHandler(this);
}
>>>>>>> 009b9085d680b1247824bb015fbe3101abbfe636

    }

    @Override
    public void handle(CommandLine commandLine) {
        try {
<<<<<<< HEAD
            commandInterpreter.interpret(commandLine);
        } catch (Exception e) {
=======
            commandInterpreter.interpret(commandLine, consolePrinter);
        } catch (InvalidCommandParameterException e) {
            e.printStackTrace();
        } catch (InvalidCommandException e) {
>>>>>>> 009b9085d680b1247824bb015fbe3101abbfe636
            e.printStackTrace();
        }
    }
}
