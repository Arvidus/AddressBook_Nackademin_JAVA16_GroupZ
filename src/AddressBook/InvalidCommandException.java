package AddressBook;

/**
 * Created by Robin on 22/12/2016.
 */
public class InvalidCommandException extends Exception {

    public InvalidCommandException(String message){
        super(message);
    }
    public InvalidCommandException(String message, Throwable throwable){
        super(message, throwable);
    }
}
