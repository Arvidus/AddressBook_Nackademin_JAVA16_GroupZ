package AddressBook;


public class InvalidCommandException {
 * Created by Robin on 22/12/2016.
 */
public class InvalidCommandException extends Exception {

    public InvalidCommandException(String message){
        super(message);
    }
    public InvalidCommandException(String message, Throwable throwable){
        super(message, throwable);
    }
>>>>>>> 54ec816ed513a280f8761f9f1e63215d07368460
}
