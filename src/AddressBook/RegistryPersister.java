package AddressBook;

import java.io.*;
import java.util.ArrayList;

public class RegistryPersister {
    public static synchronized void save(){
        File file = new File("contacts.txt");

        try{
            if(!file.exists())
                file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Registry.contacts);
            fos.close();
            oos.close();

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
