package address_book;

import java.util.Scanner;

public class Console implements ConsolePrinter {

    public Console(){

        String input;
        Scanner scanner = new Scanner(System.in);

        while (true){
            input = scanner.nextLine();
            CommandLine commandLine = new CommandLine();
            commandLine = commandLine.parse(input);

        }
    }

    public void registerInputHandler(InputHandler inputHandler){

    }

    @Override
    public void print(String feedback) {
      System.out.println(feedback);
    }
}
