package AddressBook;

import java.io.*;
import java.util.ArrayList;

public class RegistryPersister {
    public static synchronized void save(){
        File file = new File("contacts.txt");
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(Registry.contacts);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void load(){
        File file = new File("contacts.txt");
        try (FileInputStream load = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(load)){
            Registry.contacts = (ArrayList<Contact>) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
