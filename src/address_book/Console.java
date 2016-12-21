package address_book;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.Scanner;

public class Console implements ConsolePrinter {

    public Console(){

        String input;
        Scanner scanner = new Scanner(System.in);

        while (true){
            input = scanner.nextLine();
            CommandLine.parse(input);

        }
    }

    public void registerInputHandler(InputHandler inputHandler){

    }

    @Override
    public void print(String feedback) {
      System.out.println(feedback);
    }
}
