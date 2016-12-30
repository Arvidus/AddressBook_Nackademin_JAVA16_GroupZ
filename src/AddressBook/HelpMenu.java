package AddressBook;

import java.util.*;

/**
 * Created by Robin on 27/12/2016.
 */
public class HelpMenu {
    private List<Command> commands = null;

    public HelpMenu(){
        build();
    }

    private void build(){

    }

    public List<Command> getCommands(){
        return commands;
    }
}
