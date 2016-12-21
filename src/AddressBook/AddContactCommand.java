package AddressBook;


import java.util.ArrayList;
import java.util.List;

public class AddContactCommand implements Command{

    List<String> parameters = new ArrayList<String>();
    Registry registry = new Registry();

    public AddContactCommand(ConsolePrinter consolePrinter, Registry registry, ArrayList<String> parameters) {

    }

    @Override
    public void getName() {

    }

    @Override
    public void getDescription() {

    }

    @Override
    public void execute() {

    }

    private void validate(){

    }
}
