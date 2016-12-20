package contacts;

/**
 * Created by Robin on 20/12/2016.
 */
public class AutoSave {
    public void save(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5_000);
                    RegistryPersister.save();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
