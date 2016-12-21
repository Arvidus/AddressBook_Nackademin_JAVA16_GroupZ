package AddressBook;

import java.util.ArrayList;
import java.util.List;

public class CommandLine {

    String command;
    List<String> parameters = new ArrayList<>();

    protected CommandLine(){

    }

    public static CommandLine parse(String command) {

        CommandLine commandLine = new CommandLine();

        String[] parameterLines = command.split(" ");

        for (int i = 0; i < parameterLines.length -1; i++){
            commandLine.parameters.add(parameterLines[i]);
        }

        commandLine.command = command;

        return commandLine;
    }
}
