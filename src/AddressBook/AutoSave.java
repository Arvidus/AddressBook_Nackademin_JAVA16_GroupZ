package AddressBook;

public class AutoSave {
    public AutoSave() {
        Thread autoSave = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5_000);
                        RegistryPersister.save();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        autoSave.setDaemon(true);
        autoSave.start();
    }
}