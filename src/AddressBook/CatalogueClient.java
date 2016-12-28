package AddressBook;

import java.io.*;
import java.net.Socket;

/**
 * Created by Robin on 20/12/2016.
 */
public class CatalogueClient {
    private String host;
    private int port;
    private Socket socket = null;
    private InputStream inputStream = null;
    private InputStreamReader isr = null;
    private OutputStream outputStream = null;
    private PrintWriter writer = null;
    private BufferedReader reader = null;

    public CatalogueClient (String host, int port){
        this.host = host;
        this.port = port;
    }

    public void connect(){
        try {
            socket = new Socket(host, port);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void sendRequest(String request){

        try {
            inputStream = socket.getInputStream();
            isr = new InputStreamReader(inputStream);
            reader = new BufferedReader(isr);
            outputStream = socket.getOutputStream();
            writer = new PrintWriter(outputStream);

            writer.println(request);
            writer.flush();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String waitForResponse(){

        StringBuilder sb = new StringBuilder();
        String response = "";
        try {
            while ((response = reader.readLine()).length() > 0) {
                sb.append(response);
                sb.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void disconnect(){

        try {
            writer.println("exit");
            writer.flush();
            writer.close();
            isr.close();
            socket.close();
            reader.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
