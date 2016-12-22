package AddressBook;

import java.io.*;
import java.util.ArrayList;

public class RegistryPersister {
    Registry registry = null;
    public RegistryPersister(Registry registry){
        this.registry = registry;
    }
    public synchronized void save(){
        File file = new File("contacts.ser");

        try{
            if(!file.exists())
                file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(registry.contacts);
            fos.close();
            oos.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void load(){
        File file = new File("contacts.ser");
        try (FileInputStream load = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(load)){
            registry.contacts = (ArrayList<Contact>) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
