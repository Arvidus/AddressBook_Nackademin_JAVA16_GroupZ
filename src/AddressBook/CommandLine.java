package AddressBook;

import java.util.List;

/**
 * Created by Miroch on 2016-12-20.
 */
public class CommandLine {

    String command;
    List<String> parameters;

    public CommandLine(String command, List<String> parameters) {
        this.command = command;
        this.parameters = parameters;
    }

    public CommandLine parse(String command) {

        CommandLine commandLine = new CommandLine(command,parameters);

        return commandLine;
    }
}
