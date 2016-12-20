package address_book;

public class Application {

    public static void main(String[] args) {

        Application application = new Application();

        application.start();
    }

    public void start() {

        CommandLineInterface  commandLineInterface = new CommandLineInterface();
    }

    public void quit() {
        System.exit(0);
    }
}
