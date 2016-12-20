package AddressBook;

import java.util.List;

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
