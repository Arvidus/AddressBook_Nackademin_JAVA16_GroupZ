package AddressBook;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Robin on 20/12/2016.
 */
public class RegistryPersister {
    public static synchronized void save(){
        File file = new File("Contacts.txt");
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(Registry.contacts);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void load(){
        File file = new File("Contacts.txt");
        try (FileInputStream load = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(load)){
            Registry.contacts = (ArrayList<Contact>) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
