package AddressBook;

import java.util.List;

public class QuitCommand implements Command{
    List<String> parameters = null;
    ConsolePrinter consolePrinter = null;

    public QuitCommand(ConsolePrinter consolePrinter, List<String> parameters){
        this.consolePrinter = consolePrinter;
        this.parameters = parameters;
    }

    @Override
    public String getName() {
        return "quit";
    }

    @Override
    public String getDescription() {
        return "quits the program.";
    }

    @Override
    public void execute() {
        if(parameters.get(1).length() > 0){
            consolePrinter.print("quiting the program.");
            System.exit(0);
        }
    }
}
