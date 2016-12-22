package AddressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gustav on 2016-12-21.
 */
public class SearchCommand implements Command {

    List<String> parameters = new ArrayList<String>();
    Registry registry = null;
    ConsolePrinter consolePrinter = null;

    public SearchCommand(ConsolePrinter consolePrinter, Registry registry, List<String> parameters){
        this.consolePrinter = consolePrinter;
        this.registry = registry;
        this.parameters = parameters;
    }

    @Override
    public String getName() {
        return "search";
    }

    @Override
    public String getDescription() {
        return "searches the contact list using a search term.";
    }

    @Override
    public void execute() {

        if(parameters.get(1).length() != 0) {
            consolePrinter.print("" + new ContactListSorter(registry.search(parameters.get(1))));
        } else
            consolePrinter.print("You need a search term to search for a contact.");
    }
}
