package AddressBook;

public class AutoSave {
    private RegistryPersister registryPersister = null;
    public AutoSave(RegistryPersister registryPersister) {
        this.registryPersister = registryPersister;
        Thread autoSave = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5_000);
                        registryPersister.save();
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