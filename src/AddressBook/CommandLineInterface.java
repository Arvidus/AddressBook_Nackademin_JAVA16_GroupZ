
package AddressBook;

public class CommandLineInterface implements InputHandler {

    Registry registry = new Registry();
    RemoteRegistry remoteRegistry = new RemoteRegistry();
    CatalogueLoader catalogueLoader = new CatalogueLoader(remoteRegistry);
    CommandInterpreter commandInterpreter = new CommandInterpreter();
    ConsolePrinter consolePrinter = null;


    public CommandLineInterface(){

        catalogueLoader.run();

        while (true) {
            Console console = new Console();
            consolePrinter = console;
            console.registerInputHandler(this);
        }
    }


    @Override
    public void handle(CommandLine commandLine) {
        try {
            commandInterpreter.interpret(commandLine, registry, consolePrinter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
