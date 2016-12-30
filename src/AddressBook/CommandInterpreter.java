
package AddressBook;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CommandInterpreter {


    File registryContacts = new File("contacts.ser");
    Registry registry = new Registry();
    RegistryPersister registryPersister = new RegistryPersister(registry);
    RemoteRegistry remoteRegistry = null;
    CatalogueLoader catalogueLoader = new CatalogueLoader(remoteRegistry);
    ConsolePrinter consolePrinter = null;
    List<Contact> contactList = null;

    public CommandInterpreter() {

        if (registryContacts.exists())
            registryPersister.load();
        // Commenting out the remote registry code, because of exception spamming.
        //catalogueLoader.run();
    }


    public void interpret(CommandLine commandLine, ConsolePrinter consolePrinter) throws InvalidCommandException, InvalidCommandParameterException {

        List<String> temp = commandLine.parameters;
        List<Command> commandList = null;
        this.consolePrinter = consolePrinter;
        contactList = registry.getContacts();
        remoteRegistry = new RemoteRegistry();
        contactList.addAll(remoteRegistry.getContacts());

        AddContactCommand addContactCommand = new AddContactCommand(consolePrinter, registry, temp);
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(consolePrinter, registry, temp);
        ListCommand listCommand = new ListCommand(consolePrinter, contactList);
        SearchCommand searchCommand = new SearchCommand(consolePrinter, registry, temp);
        QuitCommand quitCommand = new QuitCommand(consolePrinter, temp);
        HelpCommand helpCommand = new HelpCommand();

        HelpMenu helpMenu = new HelpMenu();

        switch (temp.get(0)) {
            case "add":
                addContactCommand.execute();
                new AutoSave(registryPersister);
                break;
            case "delete":
                deleteContactCommand.execute();
                break;
            case "list":
                listCommand.execute();
                break;
            case "search":
                searchCommand.execute();
                break;
            case "help":
                commandList = helpMenu.getCommands();
                for (Command c : commandList) {
                    consolePrinter.print(helpCommand.format(c));
                }
                break;
            case "quit":
                quitCommand.execute();
                break;
            default:
                throw new InvalidCommandException("Could not interpret the command.");
        }
    }

}
