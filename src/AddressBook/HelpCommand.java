package AddressBook;

import java.util.List;

public class HelpCommand {
    private List<Command> commands = null;
    private HelpMenu helpMenu = new HelpMenu();

    public String format(Command command){
        return command.getName() + " - " + command.getDescription();
    }
}
