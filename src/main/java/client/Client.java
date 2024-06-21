package client;

import java.io.IOException;
import java.net.Socket;

public abstract class Client{

    Socket socket;

    public void connectToServer(String address, int port) {
        try {
            socket = new Socket(address, port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendData(){

    }

}
