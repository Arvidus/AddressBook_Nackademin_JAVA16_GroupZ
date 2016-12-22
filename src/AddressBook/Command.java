package AddressBook;

public interface Command {

    public String getName();
    public String getDescription();
    public void execute() throws InvalidCommandParameterException;
}
