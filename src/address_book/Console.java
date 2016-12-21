package address_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console implements ConsolePrinter {


    public Console(){

        String input;
        Scanner scanner = new Scanner(System.in);


        while (true){
            input = scanner.nextLine();
            CommandLine.parse(input);
            registerInputHandler(new InputHandler() {
                @Override
                public void handle(CommandLine commandLine) {
                }
            });
        }
    }

    public void registerInputHandler(InputHandler inputHandler){

    }


    @Override
    public void print(String feedback) {
      System.out.println(feedback);
    }
}
