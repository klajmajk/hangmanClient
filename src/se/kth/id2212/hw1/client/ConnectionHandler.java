package se.kth.id2212.hw1.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import se.kth.id2212.common.Request;
import se.kth.id2212.common.Response;

/**
 *
 * @author Lucas
 */
public class ConnectionHandler {

    Socket server;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public ConnectionHandler() {
        try {
            this.server = new Socket("localhost", 5555); //TODO
            this.oos = new ObjectOutputStream(server.getOutputStream());
            this.ois = new ObjectInputStream(server.getInputStream());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public Response sendRequest(Request req) {

        try {
            this.oos.writeObject(req);
            this.oos.flush();
            this.oos.reset();

            return (Response) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }
}
