package AddressBook;

import java.io.InputStream;
import java.util.Scanner;

public class Console implements ConsolePrinter {

        CommandLine commandLine = new CommandLine();

    public Console(){

        String input;
        Scanner scanner = new Scanner(System.in);


        while (true){
            input = scanner.nextLine();
            commandLine = CommandLine.parse(input);
            break;
        }
    }

    public void registerInputHandler(InputHandler inputHandler){
        inputHandler.handle(commandLine);
    }


    @Override
    public void print(String feedback) {

        System.out.println(feedback);
    }
}
