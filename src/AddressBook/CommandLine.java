package AddressBook;

import java.util.List;

/**
 * Created by Miroch on 2016-12-20.
 */
public class CommandLine {

    String command;
    List<String> parameters;

    public CommandLine parse(String command) {

        CommandLine commandLine = new CommandLine();

        String[] parameterLines = command.split(" ");

        for (int i = 0; i < parameterLines.length; i++){
            commandLine.parameters.add(parameterLines[i]);
        }

        commandLine.command = command;

        return commandLine;
    }
}
